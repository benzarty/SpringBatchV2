package in.ashokit.config;

import org.springframework.batch.item.ItemProcessor;

import in.ashokit.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(Customer item) throws Exception {

        // logic
//        if (item.getGender().equals("India")) {
//            return item;
//        }
//        return null;
        return item;
    }

}
