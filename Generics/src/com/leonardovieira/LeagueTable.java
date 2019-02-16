package com.leonardovieira;

import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<E extends Team> {
    private ArrayList<E> teams;

    public LeagueTable() {
        this.teams = new ArrayList<>();
    }

    public boolean addTeam(E team){
        if (teams.contains(team)){
            return false;
        }
        teams.add(team);
        return true;
    }

    public void printTable(){
        Collections.sort(teams);
//        for(int i=0; i<teams.size(); i++){
//            System.out.println(teams.get(i).getName());
//        }
        for(E e : teams){
            System.out.println(e.getName() + ": " + e.ranking());
        }
    }

}
