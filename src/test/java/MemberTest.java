import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @Before
  public void clearAll() {
    Member.clear();
  }

  @Test
  public void Member_instantiatesCorrectly_true() {
    Member myMember = new Member("Colin");
    assertEquals(true, myMember instanceof Member);
  }

  @Test
  public void Member_instantiatesWithName_String() {
    Member myMember = new Member("Colin");
    assertEquals("Colin", myMember.getName());
  }

  @Test
  public void all_returnsAllInstancesOfMember_true() {
    Member firstMember = new Member("Colin");
    Member secondMember = new Member("Grace");
    assertEquals(true, Member.all().contains(firstMember));
    assertEquals(true, Member.all().contains(secondMember));
  }

  @Test
  public void getId_membersInstantiateWithAnID_1() {
    Member myMember = new Member("Colin");
    assertEquals(1, myMember.getId());
  }

  @Test
  public void find_returnsMemberWithSameId_secondMember() {
    Member firstMember = new Member("Colin");
    Member secondMember = new Member("Grace");
    assertEquals(Member.find(secondMember.getId()), secondMember);
  }

}
