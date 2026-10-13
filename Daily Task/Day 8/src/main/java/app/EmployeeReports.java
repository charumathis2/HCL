
package app;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeReports {

    // TreeMap sorts department names alphabetically.
    public void displayDepartmentReport(
            Map<String, Integer> departmentCounts) {

        Map<String, Integer> sortedReport =
                new TreeMap<>(departmentCounts);

        System.out.println("\n--- Department-wise Employee Report ---");

        for (Map.Entry<String, Integer> entry :
                sortedReport.entrySet()) {
            System.out.println(
                    entry.getKey() + " : "
                    + entry.getValue() + " employees");
        }
    }
}
