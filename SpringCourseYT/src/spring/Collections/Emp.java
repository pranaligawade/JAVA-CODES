package spring.Collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
    private String name;
    private List<String> phone;
    private Set<String> address;
    private Map<String, String> course;
    private Properties props;

    public Emp(String name, List<String> phone, Set<String> address, Map<String, String> course, Properties props) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.course = course;
        this.props = props;
    }

    public Emp() {
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", address=" + address +
                ", course=" + course +
                ", props=" + props +
                '}';

    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourse() {
        return course;
    }

    public void setCourse(Map<String, String> course) {
        this.course = course;
    }

}
