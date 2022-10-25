package com.github.maiotachannel.castlewars.player.scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class LobbyScoreBoard {

    /**
     * ロビー内用のスコアボードをプレイヤーに設定します
     */

    void setLobbyScoreBoard(){
        ScoreboardManager scoreboardManager = Bukkit.getScoreboardManager();
        Scoreboard scoreboard = scoreboardManager.getNewScoreboard();
        Objective objective = scoreboard.registerNewObjective("LobbyScoreboard","dummy","CastleWars");
        objective.getScore("＃日付").setScore(8);
        objective.getScore("").setScore(7);
        objective.getScore("Level: 数字").setScore(6);
        objective.getScore("GameCoin: 数字").setScore(5);
        objective.getScore(ChatColor.RESET.toString()).setScore(4);
        objective.getScore("サーバー人数: 数字").setScore(3);
        objective.getScore("Ping: 数字").setScore(2);
        objective.getScore(ChatColor.RESET+ChatColor.RESET.toString()).setScore(1);
        objective.getScore("サーバーIP").setScore(0);
    }

}
