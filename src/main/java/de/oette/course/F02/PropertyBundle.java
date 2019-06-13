package de.oette.course.F02;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * property.demo.inject
 * property.demo.environment-var
 * property.demo.subCategory.value1
 * property.demo.subCategory.value2
 */
@Component
@ConfigurationProperties(prefix = "property.demo")
public class PropertyBundle {

    private String inject;
    private SubCategory subCategory;

    public String getInject() {
        return inject;
    }

    public void setInject(String inject) {
        this.inject = inject;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    public static class SubCategory {
        private String value1;
        private String value2;

        public String getValue1() {
            return value1;
        }

        public void setValue1(String value1) {
            this.value1 = value1;
        }

        public String getValue2() {
            return value2;
        }

        public void setValue2(String value2) {
            this.value2 = value2;
        }
    }
}
