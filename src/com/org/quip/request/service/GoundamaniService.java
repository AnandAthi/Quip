package com.org.quip.request.service;

public class GoundamaniService {
	protected static final String dialogues[] = {
			"I three love you...",
			"Adei dappa thalaiya nan SSLC da...",
			"Ethuku than uurukula oru \"All in all Alaguraja\" thevaidrathu...",
			"Arasiyala ethelam saatharanamapaa...",
			"Ayyo rama... ena en intha mari kalisada passangalodalam kootu sera vaikara...",
			"Dei konjam mudi molachu konjam mulaikatha mandaiya... vada seekirama...",
			"Dei... dei dei dei dei... dei segapu satta...",
			"Ho gaya ho gaya... oh manji oh nenji... ettaiya... engaiya....",
			"Dei... Kidna naaiye... 4 latcham avanuku athigam da...",
			"Mother Poranga... yarunga nama ammangala??? Mother superior.... Suparia paaku than poduvangala...",
			"Nari oolai vitruchu... success...",
			"Sangoothara vayasula Sangeeethaaa....",
			"Ada entha naatula thozhil athibargal tholai thaangalapa... punnaku vikaravan.. gundusi vikaravanalam thozhil athibaragalam....",
			"Entha marilam pesa soli yara solikudukara??"};

	public static final int length = dialogues.length;

	public static String getDialogue(int i)
			throws ArrayIndexOutOfBoundsException {
		return dialogues[i];
	}
}
