package basejava;

import java.util.Objects;

public class WrapperString {
    private String name;

    public WrapperString(String name) {
        this.name = name;
    }
    public void replace (char oldchar, char newchar){
        name = name.replace(oldchar, newchar);
    }

    @Override
    public String toString() {
        return "WrapperString{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WrapperString that = (WrapperString) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
