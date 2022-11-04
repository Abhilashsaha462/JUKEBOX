package org.example;

import org.example.DAOImplClasses.*;
import org.example.Model.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n ---------------------Welcome to Jukebox-----------------------\n");
        System.out.println("********************************");
        while(true) {
            System.out.println("Are you an existing user \n1. Yes \n2. No");
            int choice = sc.nextInt();
            if (choice == 2) {
                System.out.println("Create a account \n1. Yes \n2. No");
                int choice1 = sc.nextInt();
                if (choice1 == 2) {
                    System.out.println("Thanks you.. see you again!!");
                    System.exit(0);
                } else {
                    try {
                        System.out.print("Enter  UserId:");
                        String userid = sc.next();
                        System.out.print("Enter  Password:");
                        String password = sc.next();
                        UserImpl user = new UserImpl();
                        if (user.loginAccount(userid, password)) {
                            System.out.println("---------Logout Successfully-------------\n");
                        } else {
                            System.out.println("-------------login Failed!------------\n");
                        }
                    } catch (Exception e) {
                        System.out.println("Enter Valid Data--Login Failed\n");
                    }
                  }
              } else if (choice == 1) {
                try {
                    System.out.print("Enter  UserId:");
                    String userid = sc.next();
                    System.out.print("Enter  Password:");
                    String password = sc.next();
                    System.out.print("Enter Mobile Number:");
                    Long mobno = sc.nextLong();
                    UserImpl user1 = new UserImpl();
                    if (user1.createAccount(userid, password, mobno)) {
                        System.out.println("Hi!! " + userid + " Welcome to Jukebox ");

                        System.out.println("Select one\n1. Songs \n2. Podcasts \n3. Playlists \n4. Playlistdetils");
                        Scanner op = new Scanner(System.in);
                        String operation = op.next();
                        if (operation.equals("1")) {
                            System.out.println("Enter Your Choice \n1. Display all songs\n" +
                                    "2. Sort song details\n3. Search song details \n" +
                                    "4. Play song \n5. Exit");
                            System.out.println("********************************");
                            System.out.println("Enter your choice");
                            int ch = sc.nextInt();
                            switch (ch) {
                                case 1:
                                    System.out.println("----------Display all songs----------");
                                    List<Songs> songListDetails = new SongImpl().display_allsongs();
                                    songListDetails.stream().forEach(x -> System.out.println(x));
                                    break;

                                case 2:
                                    System.out.println("-------------Display sorted songname in alphabetical order------------------");
                                    List<Songs> songsList1Details = new SongImpl().sort_song();
                                    songsList1Details.stream().sorted((Songs a, Songs b) -> a.getSongname().compareToIgnoreCase(b.getSongname())).collect(Collectors.toList());
                                    songsList1Details.stream().forEach(x -> System.out.println(x));
                                    break;

                                case 3:
                                    System.out.println("----------------------------Search songid----------------------------");
                                    System.out.println("Enter songid to search");
                                    int songid = sc.nextInt();
                                    List<Songs> songsList2Details = new SongImpl().search_song();
                                    songsList2Details.stream().filter(i -> i.getSongid() == songid).collect(Collectors.toList());
                                    songsList2Details.stream().forEach(x -> System.out.println(x));
                                    break;

                                case 4:
                                    System.out.println("---------------------Play Song-----------------");
                                    System.out.println("Enter the songid which you want to play");
                                    int songid1 = sc.nextInt();
                                    Connection connection = DBConnection.getConnection();
                                    String query3 = "select filepath from Songs where songid= ?";
                                    PreparedStatement pst1 = connection.prepareStatement(query3);
                                    pst1.setInt(1, songid1);
                                    String filepath = "";
                                    ResultSet rs2 = pst1.executeQuery();
                                    while (rs2.next()) {
                                        filepath = rs2.getString(1);
                                    }
                                    org.example.Main m1 = new org.example.Main();
                                    m1.readAudio(filepath, 1);
                                    break;

                                case 5:
                                    System.exit(0);
                                default:
                                    System.out.println("Invalid choice");
                            }
                        } else if (operation.equals("2")) {
                            System.out.println("Enter Your Choice \n1. Display all podcasts\n" +
                                    "2. Sort podcasts details\n3. Play podcasts\n" +
                                    "4. Search Podcast\n5. Exit");
                            System.out.println("********************************");
                            System.out.println("Enter your choice");
                            int ch = sc.nextInt();
                            switch (ch) {
                                case 1:
                                    System.out.println("----------Display all podcasts----------");
                                    List<Podcast> PodcastListDetails = new PodcastImpl().display_allpodcasts();
                                    PodcastListDetails.stream().forEach(x -> System.out.println(x));
                                    break;

                                case 2:
                                    System.out.println("-------------Display sorted podcastname in alphabetical order------------------");
                                    List<Podcast> PodcastList1Details = new PodcastImpl().sort_podcast();
                                    PodcastList1Details.stream().sorted((Podcast a, Podcast b) -> a.getPodcastname().compareToIgnoreCase(b.getPodcastname())).collect(Collectors.toList());
                                    PodcastList1Details.stream().forEach(x -> System.out.println(x));
                                    break;

                                case 3:
                                    System.out.println("---------------------Play Podcast-----------------");
                                    System.out.println("Enter the podcastid which you want to play");
                                    int podid1 = sc.nextInt();
                                    Connection connection1 = DBConnection.getConnection();
                                    String query4 = "select filepath from Podcast where podid= ?";
                                    PreparedStatement pst2 = connection1.prepareStatement(query4);
                                    pst2.setInt(1, podid1);
                                    String filepath1 = "";
                                    ResultSet rs3 = pst2.executeQuery();
                                    while (rs3.next()) {
                                        filepath1 = rs3.getString(1);
                                    }
                                    org.example.Main m2 = new org.example.Main();
                                    m2.readAudio(filepath1, 1);
                                    break;

                                case 4:
                                    System.out.println("----------------------------Search podid----------------------------");
                                    System.out.println("Enter podid to search");
                                    int podid = sc.nextInt();
                                    List<Podcast> PodcastList3Details = new PodcastImpl().search_podcast();
                                    PodcastList3Details.stream().filter(i -> i.getPodid() == podid).collect(Collectors.toList());
                                    PodcastList3Details.stream().forEach(x -> System.out.println(x));
                                    break;

                                case 5:
                                    System.exit(0);
                                default:
                                    System.out.println("Invalid choice");
                            }
                        } else if (operation.equals("3")) {
                            System.out.println("Enter Your Choice \n1. Create all playlists\n" +
                                    "2. Display playlists \n3. Sort playlists \n" +
                                    "4. Search playlist\n5. Exit");
                            System.out.println("********************************");
                            System.out.println("Enter your choice");
                            int ch = sc.nextInt();
                            switch (ch) {
                                case 1:
                                    try {
                                        System.out.print("Enter playlistid:");
                                        int playlistid = sc.nextInt();
                                        System.out.print("Enter playlistname:");
                                        String playlistname = sc.next();
                                        System.out.print("Enter userid:");
                                        String userid1 = sc.next();
                                        PlaylistImpl playlist = new PlaylistImpl();
                                        if (playlist.createAccount(playlistid, playlistname, userid1)) {
                                            System.out.println("----- Playlist Account Created Successfully!----\n");
                                        } else {
                                            System.out.println("---------Playlist Account Creation Failed!------\n");
                                        }
                                    } catch (Exception e) {
                                        System.out.println(" Enter Valid Data::Insertion Failed!\n");
                                    }
                                    break;

                                case 2:
                                    System.out.println("----------Display all Playlists----------");
                                    List<Playlist> PlayList1Details = new PlaylistImpl().display_allplaylist();
                                    PlayList1Details.stream().forEach(x -> System.out.println(x));
                                    break;

                                case 3:
                                    System.out.println("-------------Display sorted Playlistname in alphabetical order------------------");
                                    List<Playlist> PlayList2Details = new PlaylistImpl().sort_playlist();
                                    PlayList2Details.stream().sorted((Playlist a, Playlist b) -> a.getPlaylistname().compareToIgnoreCase(b.getPlaylistname())).collect(Collectors.toList());
                                    PlayList2Details.stream().forEach(x -> System.out.println(x));
                                    break;

                                case 4:
                                    System.out.println("----------------------------Search Playlistid----------------------------");
                                    System.out.println("Enter playlistid to search");
                                    int playlistid = sc.nextInt();
                                    List<Playlist> PlayList3Details = new PlaylistImpl().search_playlist();
                                    PlayList3Details.stream().filter(i -> i.getPlaylistid() == playlistid).collect(Collectors.toList());
                                    PlayList3Details.stream().forEach(x -> System.out.println(x));
                                    break;

                                case 5:
                                    System.exit(0);
                                default:
                                    System.out.println("Invalid choice");
                            }
                        } else if (operation.equals("4")) {
                            System.out.println("Enter Your Choice>>\n1. Display all playlistdetails\n" +
                                    "2. Sort playlists details\n" +
                                    "3. Search Playlistdetails\n4. Exit");
                            System.out.println("********************************");
                            System.out.println("Enter your choice");
                            int ch = sc.nextInt();
                            switch (ch) {
                                case 1:
                                    System.out.println("----------Display all PlaylistDetails----------");
                                    List<PlaylistDetails> PlayListDetails1 = new PlaylistDetailsImpl().display_allpdetails();
                                    PlayListDetails1.stream().forEach(x -> System.out.println(x));
                                    break;

                                case 2:
                                    System.out.println("-------------Display sorted PlaylistDetailsname in alphabetical order------------------");
                                    List<PlaylistDetails> PlayListDetails2 = new PlaylistDetailsImpl().sort_pname();
                                    PlayListDetails2.stream().sorted((PlaylistDetails a, PlaylistDetails b) -> a.getPname().compareToIgnoreCase(b.getPname())).collect(Collectors.toList());
                                    PlayListDetails2.stream().forEach(x -> System.out.println(x));
                                    break;

                                case 3:
                                    System.out.println("----------------------------Search PlaylistDetailsId----------------------------");
                                    System.out.println("Enter PlaylistDetailsId to search");
                                    int pid = sc.nextInt();
                                    List<PlaylistDetails> PlayListDetails3 = new PlaylistDetailsImpl().search_pid();
                                    PlayListDetails3.stream().filter(i -> i.getPid() == pid).collect(Collectors.toList());
                                    PlayListDetails3.stream().forEach(x -> System.out.println(x));
                                    break;

                                case 4:
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Invalid Choice");
                            }
                        }
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}