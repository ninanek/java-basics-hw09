import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ArraysTest {

    /**
     * Test data for common array elements.
     *
     * @return test data array
     */
    @DataProvider(name = "ArrayUtil")
    public static Object[][] arrays() {
        return new Object[][]{
                {
                        new String[]{"Python", "JAVA", "PHP", "C#", "C++", "SQL"},
                        new String[]{"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"},
                        new String[]{"JAVA", "SQL"}
                },
                {
                        new String[]{"Dynamo", "Arsenal", "MC", "MU", "Juventus", "Barcelona"},
                        new String[]{"Burnley", "Barcelona", "Inter", "Atalanta", "Sevilla", "Real", "Arsenal"},
                        new String[]{"Barcelona", "Arsenal"}
                },
                {
                        new String[]{"Kate", "Helga", "Carmen", "Nikita", "Roman", "Timur"},
                        new String[]{"Timur", "Svetlana", "Boris", "Roman", "Oleg", "Nataly", "Vladimir"},
                        new String[]{"Timur", "Roman"}
                }
        };
    }

    @Test(dataProvider = "ArrayUtil")
    public void testFindCommon(String[] array1, String[] array2, String[] expectedResult) {

        assertEquals(ArrayUtil.findCommon(array1, array2), expectedResult,
                "Common elements are not correct");
    }
}