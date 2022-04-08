import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author Mert Batuhan UNVERDI
 * @since 6.04.2022
 */
@Mojo(name = "getTime",defaultPhase = LifecyclePhase.INITIALIZE)
public class GetTime extends AbstractMojo {
    SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
    Date date = new Date(System.currentTimeMillis());
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Current Date : "+ formatter.format(date));
    }
}
