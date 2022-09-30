package polyclinic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("PolyclinicRegistry")
public class Registry implements IRegistry {

    @Autowired
    @Qualifier("archive")
    private final IDatabase archive;

    public Registry(IDatabase archive) {
        this.archive = archive;
    }

    @Override
    public boolean giveMedicalCard(String name) {
        return archive.getDocument(name);
    }
}
