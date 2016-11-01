package com.module.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class SirJadeja {
	public static List<String> playerList = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int numberOfTestCases = Integer.parseInt(line);

		playerList.add("Rohit");
		playerList.add("Dhawan");
		playerList.add("Kohli");
		playerList.add("Yuvraj");
		playerList.add("Raina");
		playerList.add("Dhoni");
		playerList.add("Sir Jadeja");

		for (int i = 0; i < numberOfTestCases; i++) {
			String valueOfK = br.readLine();
			int k = Integer.parseInt(valueOfK);

			String player = getPlayer(k);
			System.out.println(player);
		}
	}

	private static String getPlayer(int k) {

		for (int i = 0; i < k - 2; i++) {
			if (i == 0) {
				playerList.add(i, playerList.get(0));
				// System.out.println(playerList);
			} else {
				playerList.add((i * 2) % 14, playerList.get((i + i) % 14));
				// System.out.println(playerList);
			}
		}
		// System.out.println(playerList);
		return playerList.get((k % 7));
	}
}
