package guru.springframework.services;

import org.springframework.stereotype.Service;

/**
 * Created by sergei on 25/07/2018.
 */
@Service
public class GettingGreetingService implements GreetingService {

    @Override
    public String sayGreeting(){
        return "Hello - I was injected by the getter";
    }
}
