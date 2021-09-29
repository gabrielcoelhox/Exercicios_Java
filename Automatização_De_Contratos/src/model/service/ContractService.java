package model.service;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;                                //EX: basicQuota = 200.00
		for (int i = 1; i <= months; i++) {
			Date dueDate = addMonths(contract.getDate(), i);        //Add i meses ao contrato conforme o for
			double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);  //EX: 200.00 + 1% * 1 = 202
			double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);  //EX: 202.00 + 2% = 206.04
			contract.addInstallment(new Installment(dueDate, fullQuota));
		}
	}
		
	//Adicionar meses há data estabelecida
	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);	
		return cal.getTime();
	}
}
