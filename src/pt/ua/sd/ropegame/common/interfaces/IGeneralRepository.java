package pt.ua.sd.ropegame.common.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IGeneralRepository extends Remote {

    void updateCoachState(String state, int teamID) throws RemoteException;

    void updateContestantState(String state, int gameMemberID, int teamID) throws RemoteException;

    void updateRefState(String state) throws RemoteException;
    boolean requestToDie() throws RemoteException;

}