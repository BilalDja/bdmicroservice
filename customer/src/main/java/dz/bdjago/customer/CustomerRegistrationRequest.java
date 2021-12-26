package dz.bdjago.customer;

public record CustomerRegistrationRequest(
        String firstname,
        String lastname,
        String email
) {
}
