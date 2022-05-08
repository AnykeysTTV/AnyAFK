import org.osbot.rs07.api.ui.Tab;
import org.osbot.rs07.script.Script;
import org.osbot.rs07.script.ScriptManifest;

@ScriptManifest(author = "Anykeys#0663", name="AnyAFK", info = "https://discord.gg/fJebNHcBG6", logo = "", version = 1.0)
public class AnyAFK extends Script {

    @Override
    public int onLoop() throws InterruptedException {

        if(!client.isLoggedIn() && client.isWelcomeScreenVisible())
            return 1000;

        if (!tabs.isOpen(Tab.INVENTORY))
            tabs.open(Tab.INVENTORY, true);
        else
            tabs.open(Tab.SKILLS, true);

        log("AnyAFK : Active");

        return 4*60*1000;
    }
}


