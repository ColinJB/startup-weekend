import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {

  @Before
  public void clearAll() {
    Team.clear();
  }

  @Test
  public void team_instantiatesCorrectly_true() {
    Team testTeam = new Team("Red");
    assertEquals(true, testTeam instanceof Team);
  }

  @Test
  public void getName_teamInstantiatesWithName_Red() {
    Team testTeam = new Team("Red");
    assertEquals("Red", testTeam.getName());
  }

  @Test
  public void all_returnsAllInstancesOfTeam_true() {
    Team firstTeam = new Team("Red");
    Team secondTeam = new Team("Blue");
    assertEquals(true, Team.all().contains(firstTeam));
    assertEquals(true, Team.all().contains(secondTeam));
  }

  @Test
 public void clear_emptiesAllTeamsFromList_0() {
   Team testTeam = new Team("Red");
   Team.clear();
   assertEquals(Team.all().size(), 0);
 }

 @Test
 public void getId_teamsInstantiateWithAnId_1() {
   Team testTeam = new Team("Red");
   assertEquals(1, testTeam.getId());
 }

 @Test
 public void find_returnsTeamWithSameId_secondTeam() {
   Team firstTeam = new Team("Red");
   Team secondTeam = new Team("Blue");
   assertEquals(Team.find(secondTeam.getId()), secondTeam);
 }

  @Test
  public void getMembers_initiallyReturnsEmptyList_ArrayList() {

    Team testTeam = new Team("Red");
    assertEquals(0, testTeam.getMembers().size());
  }

  @Test
  public void addMember_addsMemberToList_true() {
    Team testTeam = new Team("Red");
    Member testMember = new Member("Colin");
    testTeam.addMember(testMember);
    assertTrue(testTeam.getMembers().contains(testMember));
  }

}
