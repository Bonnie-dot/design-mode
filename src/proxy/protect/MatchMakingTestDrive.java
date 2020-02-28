package proxy.protect;

import java.lang.reflect.Proxy;
import java.util.HashMap;

public class MatchMakingTestDrive {
    HashMap<String, PersonBean> DB = new HashMap();

    public static void main(String[] args) {
        MatchMakingTestDrive matchMakingTestDrive = new MatchMakingTestDrive();
        matchMakingTestDrive.drive();

    }

    public MatchMakingTestDrive() {
        initialDB();
    }

    void drive() {
        PersonBean person = getPersonFromDatabase("Joe JavaBean");
        PersonBean ownerProxy = getOwnerProxy(person);
        ownerProxy.setInterests("bowling,Go");
        ownerProxy.setHotOrNotRating(10);

        System.out.println("name:" + ownerProxy.getName() + "interests:" + ownerProxy.getInterests() + "HotOrNotRating:" + ownerProxy.getHotOrNotRating());

        PersonBean kellyPerson = getPersonFromDatabase("Kelly Klosure");
        PersonBean nonOwnerProxy = getNonOwnerProxy(kellyPerson);
        nonOwnerProxy.setInterests("bowling");
        nonOwnerProxy.setHotOrNotRating(1);
        System.out.println("name:" + nonOwnerProxy.getName() + "interests:" + nonOwnerProxy.getInterests() + "HotOrNotRating:" + nonOwnerProxy.getHotOrNotRating());

    }

    PersonBean getOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new OwnerInvocationHandler(personBean)
        );
    }

    PersonBean getNonOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(personBean)
        );
    }

    PersonBean getPersonFromDatabase(String name) {
        return (PersonBean) DB.get(name);
    }

    void initialDB() {
        PersonBean joe = new PersonBeanImpl();
        joe.setName("Joe JavaBean");
        joe.setInterests("cars, computers, music");
        joe.setHotOrNotRating(7);
        DB.put(joe.getName(), joe);

        PersonBean kelly = new PersonBeanImpl();
        kelly.setName("Kelly Klosure");
        kelly.setInterests("ebay, movies, music");
        kelly.setHotOrNotRating(6);
        DB.put(kelly.getName(), kelly);
    }
}
