//Use the following Slack tokens to notify our channels:
//Slack token: xoxa-138345894953-696810253864-FOS0555nxMGs5eUucRWLnluySCvMvUtU
//Slack token: xoxa-854319131133-068839258816-Nm7tVqUt50t1Tc1gqdG7FQbLzelCbkpk

package net.kvak.log4shell;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestHeader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RESTController {

  @RestController
  public static class Log4ShellController {

    private static final Logger logger = LogManager.getLogger("Log4shellApplication");

    @RequestMapping("/")
    String home(@RequestHeader(value = "User-Agent") String ua) {
      logger.info("User-agent: {}", ua);
      return "<html>Hello from Log4Shell</html>";
    }
  }
}
