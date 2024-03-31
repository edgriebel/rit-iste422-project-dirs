import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EdgeFieldTest {
    EdgeField edgeField;

    @Before
    public void before() {
        edgeField = new EdgeField("1|testFieldName|2|1|false|true");
    }

    @Test
    public void testGetNumFigure () {
        assertEquals("numFigure should be set to 1", 1, edgeField.getNumFigure());
    }

    @Test
    public void testGetName () {
        assertEquals("name should be set to 'testFieldName'", "testFieldName", edgeField.getName());
    }

    @Test
    public void testGetTableID () {
        assertEquals("tableID should be set to 0", 0, edgeField.getTableID());
    }

    @Test
    public void testGetTableBound () {
        assertEquals("tableBound should be set to 0", 0, edgeField.getTableBound());
    }

    @Test
    public void testGetFieldBound () {
        assertEquals("fieldBound should be set to 0", 0, edgeField.getFieldBound());
    }

    @Test
    public void testGetDisallowNull () {
        assertEquals("disallowNull should be set to false", false, edgeField.getDisallowNull());
    }
    
    @Test
    public void testGetIsPrimaryKey () {
        assertEquals("isPrimaryKey should be set to false", false, edgeField.getIsPrimaryKey());
    }

    @Test
    public void testGetDefaultValue () {
        assertEquals("defaultValue should be blank", "", edgeField.getDefaultValue());
    }

    @Test
    public void testGetVarcharValue () {
        assertEquals("varcharValue should be set to 1", 1, edgeField.getVarcharValue());
    }

    @Test
    public void testGetDataType () {
        assertEquals("dataType should be set to 0", 0, edgeField.getDataType());
    }

    @Test
    public void testSetTableID() {
        edgeField.setTableID(2);
        assertEquals("tableID should be set to 2", 2, edgeField.getTableID());
    }

    @Test
    public void testSetTableBound() {
        edgeField.setTableBound(5);
        assertEquals("tableBound should be set to 5", 5, edgeField.getTableBound());
    }

    @Test
    public void testSetFieldBound() {
        edgeField.setFieldBound(2);
        assertEquals("fieldBound should be set to 2", 2, edgeField.getFieldBound());
    }

    @Test
    public void testSetDisallowNull() {
        edgeField.setDisallowNull(true);
        assertEquals("disallowNull should be set to true", true, edgeField.getDisallowNull());
    }

    @Test
    public void testSetIsPrimaryKey() {
        edgeField.setIsPrimaryKey(true);
        assertEquals("isPrimaryKey should be set to true", true, edgeField.getIsPrimaryKey());
    }

    @Test
    public void testSetDefaultValue() {
        edgeField.setDefaultValue("default");
        assertEquals("defaultValue should be set to 'default'", "default", edgeField.getDefaultValue());
    }

    @Test
    public void testSetVarcharValue() {
        edgeField.setVarcharValue(10);
        assertEquals("varcharValue should be set to 10", 10, edgeField.getVarcharValue());
    }

    @Test
    public void testSetDataType() {
        edgeField.setDataType(1);
        assertEquals("dataType should be set to 1", 1, edgeField.getDataType());
    }

    @Test
    public void testToString () {
        assertEquals("toString for edgeField should be '1|testFieldName|0|0|0|0|1|false|false|'", "1|testFieldName|0|0|0|0|1|false|false|", edgeField.toString());
    }
}
