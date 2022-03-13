package rip.crystal.practice.visual.leaderboard.variables;

import com.gmail.filoghost.holographicdisplays.api.placeholder.PlaceholderReplacer;
import rip.crystal.practice.visual.leaderboard.Leaderboard;
import rip.crystal.practice.utilities.chat.CC;
import lombok.AllArgsConstructor;
import rip.crystal.practice.visual.leaderboard.entry.LeaderboardKitsEntry;

import java.util.List;

@AllArgsConstructor
public class TopKitName implements PlaceholderReplacer {

    public String kit;
    public int pos;

    @Override
    public String update() {
        /*if (Leaderboard.getKitLeaderboards().get(kit) == null) return " ";
        else if (!Leaderboard.getKitLeaderboards().get(kit).stream().findFirst().isPresent()) return " ";
        return CC.translate(Leaderboard.getKitLeaderboards().get(kit).stream().findFirst().get().getProfile().getColor()) +
                Leaderboard.getKitLeaderboards().get(kit).stream().findFirst().get().getProfile().getName();*/
        //}

        try {
            List<LeaderboardKitsEntry> test = Leaderboard.getKitLeaderboards().get(kit);
            if (test.get(pos) == null) return " ";
            LeaderboardKitsEntry profile = test.get(pos);
            return CC.translate(profile.getProfile().getName());
        } catch (IndexOutOfBoundsException e) {
            return " ";
        }
    }
}
