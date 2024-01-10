package ie.atu.ufcproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    private RegistrationServiceClient registrationServiceClient;
    private FighterRosterService fighterRosterService;

    @Autowired
    public UserController(
            RegistrationServiceClient registrationServiceClient,
            FighterRosterService fighterRosterService) {
        this.registrationServiceClient = registrationServiceClient;
        this.fighterRosterService = fighterRosterService;
    }

    @PostMapping("/add-fighter-to-roster")
    public Map<String, String> addFighterToRoster(@RequestBody UserDetails userDetails) {
        fighterRosterService.addFighterToRoster(userDetails);

        Map<String, String> responseMessage = new HashMap<>();
        responseMessage.put("message", "Fighter added to roster successfully");
        return responseMessage;
    }
}
