public class Vendedor {
    private String name;
    private Integer age;
    private String local_trabalho;

    public Vendedor(String name, Integer age, String local_trabalho) {
        this.name = name;
        this.age = age;
        this.local_trabalho = local_trabalho;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLocal_trabalho() {
        return local_trabalho;
    }

    public void setLocal_trabalho(String local_trabalho) {
        this.local_trabalho = local_trabalho;
    }

}
