package learn.avinash.tdd.order.integration;

import learn.avinash.tdd.order.model.message.OrderMessage;

public class WarehouseManagementService {

	public static void sendOrder(OrderMessage orderMessage) throws WMSUnavailableException {
		throw new WMSUnavailableException("WMS is currently down for unknown reason");
	}
}
