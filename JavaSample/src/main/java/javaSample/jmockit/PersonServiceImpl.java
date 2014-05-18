package javaSample.jmockit;

public class PersonServiceImpl implements PersonService {

    private PersonDao personDao;

    @Override
    public void persistPerson(Person person) {
        long id = personDao.persist(person);
        person.setId(id);
    }

}
