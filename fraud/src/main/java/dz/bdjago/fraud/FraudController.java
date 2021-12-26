package dz.bdjago.fraud;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1v/fraud-check")
public class FraudController {

    private final FraudCheckService fraudCheckService;

    @GetMapping("{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable Integer customerId) {
        boolean fraudulentCustomer = fraudCheckService.isFraudulentCustomer(customerId);
        return new FraudCheckResponse(fraudulentCustomer);
    }
}
