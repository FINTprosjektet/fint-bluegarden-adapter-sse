package no.fint.provider.bluegarden.service;

import no.fint.model.administrasjon.personal.Arbeidsforhold;
import no.fint.model.administrasjon.personal.Personalressurs;
import no.fint.model.felles.Person;
import no.fint.model.relation.Relation;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class RelationService {

    private List<Relation> relations;

    @PostConstruct
    public void init() {
        relations = new ArrayList<>();
    }

    public void addPersonPersonalressursRelation(String fodselsnummer, String ansattnummer) {
        Relation relation = new Relation();

        relation.setType(Person.REL_ID_PERSONALRESSURS);
        relation.setMain(fodselsnummer);
        relation.setRelated(ansattnummer);

        relations.add(relation);
    }

    public void addAdresseCountryRelation(String land) {
        /*
        Relation relation = new Relation();

        relations.add(relation);
        */
    }

    public void addPersonGenderRelation(String fodselsnummer, String gender) {
        Relation relation = new Relation();

        relation.setType(Person.REL_ID_KJONN);
        relation.setMain(fodselsnummer);
        relation.setRelated(gender);

        relations.add(relation);
    }

    public void addPersonalressursPersonRelation(String ansattnummer, String fodselsnummer) {
        Relation relation = new Relation();

        relation.setType(Personalressurs.REL_ID_PERSON);
        relation.setMain(ansattnummer);
        relation.setRelated(fodselsnummer);

        relations.add(relation);
    }

    public void addPersonalressurskategoriPersonalressurskategoriRelation(String ansattnummer, String kategori) {
        Relation relation = new Relation();

        relation.setType(Personalressurs.REL_ID_PERSONALRESSURSKATEGORI);
        relation.setMain(ansattnummer);
        relation.setRelated(kategori);

        relations.add(relation);
    }

    public void addArbeidsforholdPersonalressursRelation(String systemId, String ansattnummer) {
        Relation relation = new Relation();

        relation.setType(Arbeidsforhold.REL_ID_PERSONALRESSURS);
        relation.setMain(systemId);
        relation.setRelated(ansattnummer);

        relations.add(relation);
    }

    public void addPersonalressursArbeidsforholdRelation(String ansattnummer, String systemId) {
        Relation relation = new Relation();

        relation.setType(Personalressurs.REL_ID_ARBEIDSFORHOLD);
        relation.setMain(ansattnummer);
        relation.setRelated(systemId);

        relations.add(relation);
    }

    public void addArbeidsforholdOrganisasjonRelation(String systemId, String orgId) {
        Relation relation = new Relation();

        relation.setType(Arbeidsforhold.REL_ID_ORGANISASJON);
        relation.setMain(systemId);
        relation.setRelated(orgId);
    }

    public List<Relation> getRelations() {
        return relations;
    }
}
