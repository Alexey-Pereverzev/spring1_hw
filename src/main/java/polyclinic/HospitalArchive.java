package polyclinic;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component("archive")
@Scope("prototype")
public class HospitalArchive implements IDatabase{

    private final HashMap<String,IDocument> catalogue;

    public HospitalArchive(IDocument document) {
        this.catalogue = new HashMap<>();
        catalogue.put(document.getName(), document);
    }


    @Override
    public boolean getDocument(String name) {
        IDocument document = catalogue.get(name);
        if (document!=null) {
            document.getContent();
            return true;
        } else {
            System.out.println("Вашей карточки нет!");
            return false;
        }
    }
}
