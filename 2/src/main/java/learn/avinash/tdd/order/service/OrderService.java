package learn.avinash.tdd.order.service;

import java.util.List;

import learn.avinash.tdd.common.ServiceException;
import learn.avinash.tdd.order.model.domain.OrderSummary;

public interface OrderService {

	List<OrderSummary> getOrderSummary(long customerId) throws ServiceException;
}
