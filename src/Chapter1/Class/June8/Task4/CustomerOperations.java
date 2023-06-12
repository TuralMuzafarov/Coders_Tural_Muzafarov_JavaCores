package Chapter1.Class.June8.Task4;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class CustomerOperations {
    public static List<Customer> Customers;
    public static void Add(Customer customer)
    {
        Customers.add(customer);
    }
    public static void Delete(Customer customer)
    {
        Customers.remove(customer);
    }
    public static Optional<Customer> FindByEmail(String email)
    {
        var stream = Customers.stream();
        var filtered = stream.filter((x)->x.getEmail() == email);
        return filtered.findFirst();
    }
}
