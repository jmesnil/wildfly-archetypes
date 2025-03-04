package foo.bar.multi;
import jakarta.ejb.Remote;

/**
 * Remote interface of the Arquillian unit test bean.
 * 
 */
@Remote
public interface TestRemote {

  /**
   * This method is invoked by the Arquillian unit test.
   * 
   * @param test Some test string
   * @return value of parameter "test"
   */
  public String doTest(String test);

}
