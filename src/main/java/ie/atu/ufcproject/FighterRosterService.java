package ie.atu.ufcproject;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FighterRosterService {

    private List<UserDetails> fighterRoster = new ArrayList<>();

    public void addFighterToRoster(UserDetails fighterDetails) {
        fighterRoster.add(fighterDetails);
    }

    public List<UserDetails> getFighterRoster() {
        return fighterRoster;
    }
}
