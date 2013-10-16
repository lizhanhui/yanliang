package tv.yanliang.domain;

public class NamedEntity extends AuditEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
