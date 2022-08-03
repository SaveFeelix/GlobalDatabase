import de.savefeelix.api.annotations.Length;
import de.savefeelix.api.annotations.Name;
import de.savefeelix.api.annotations.NullableAllowed;
import de.savefeelix.api.annotations.PrimaryKey;

@Name(name = "Test")
public class TestModel {

    @Name(name = "ID")
    @PrimaryKey
    public Integer id;

    @Name(name = "DisplayName")
    @Length(length = 20)
    public String displayName = "test";

    @Name(name = "SingleCharacter")
    @NullableAllowed
    public Character singleCharacter = 'a';

    @Name(name = "Bytes")
    @NullableAllowed
    public Byte[] bytes = new Byte[]{(byte) 'a', (byte) 'b', (byte) 'c'};
}
