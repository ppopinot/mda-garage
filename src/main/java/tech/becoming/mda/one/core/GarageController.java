package tech.becoming.mda.one.core;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.becoming.mda.one.model.actor.Owner;
import tech.becoming.mda.one.model.garage.DigitalKey;
import tech.becoming.mda.one.model.garage.DigitalLock;
import tech.becoming.mda.one.model.garage.Motor;

@RestController
@RequestMapping("garage")
@RequiredArgsConstructor
public class GarageController {

    private final Motor motor;

    @PostMapping
    public void openGarage(@RequestBody DigitalKey key) {
        final var dl = new DigitalLock(motor);
        key.setLock(dl);
        var owner = new Owner(key);
        owner.open();
    }

}
