package model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DAOEntityTest.class, DAOGetHighscoreTest.class, DAOHelloWorldTest.class, DAOLoadMapTest.class,
		DAOUploadScoreTest.class, DBConnectionTest.class, DBPropertiesTest.class, ElementTest.class,
		HelloWorldTest.class, LoadMapTest.class, ModelTest.class })
public class AllTests {

}
