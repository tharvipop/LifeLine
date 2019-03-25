/**
 * 
 */
package storyText;

import java.util.ArrayList;

import controller.World;

/**
 * @author atharvakulkarni
 *
 */
public class StoryBank {

	public static ArrayList<Story> list = new ArrayList<Story>();

	//storyString, storyLevel, option1Level, option2Level, option1, option2)
	
	/**
	 * initialized list by adding all stories that the game will need
	 */
	public StoryBank() {
		
		//level 0
		list.add(new Story("[incoming communication]\n[establishing connection]\n[receiving message]\nHello? Is this thing"
				+ "\nworking? Can anyone read me?", 0, 1, 2, "I read you.", "Who is this?"));
		//level 1
		list.add(new Story("Oh, thank God! It's so good to have human contact! It's been hours!", 1, 2, 3, "Who are you?",
				"What happened?"));
		//level 2
		list.add(new Story("My name is Cadet Taylor. Our ship crashed on some moon. I managed to get an escape pod, but I"
				+ "\ncouldn't tell if anyone else made it into one. MY IEVA suit sensor tells me that the air is breathable,"
				+ "\nat least. But I've got no food or water rations on me. The toolkit on the pod is about as basic as they"
				+ "\ncome. I managed to get the pod's mobile trasmitter working, but - lucky you - your seem to be the only"
				+ "\none in range of the signal. Whoever and wherever you might be.", 2, 5, 4, "Are you all right?", "Where"
				+ " are you?"));
		//level 3
		list.add(new Story("Our ship crashed on some moon. I managed to get an escape pod, but I"
				+ "\ncouldn't tell if anyone else made it into one. MY IEVA suit sensor tells me that the air is breathable,"
				+ "\nat least. But I've got no food or water rations on me. The toolkit on the pod is about as basic as they"
				+ "\ncome. I managed to get the pod's mobile trasmitter working, but - lucky you - your seem to be the only"
				+ "\none in range of the signal. Whoever and wherever you might be.", 3, 5, 4, "Are you all right?", "Where"
				+ " are you?"));
		//level 4
		list.add(new Story("The only was I can answer that with any confidence is to say \"stranded\". If you know where nowhere"
				+ "\nis, just look right in the middle of it, and you'll spot me."
				+ "\nThe Varia was was on a gentle elliptical path towards Tau Ceti IV. I don't know whether"
				+ "\nwe went off course, or by how much. I was nowhere near the bridge when it all went down. Colby. She --"
				+ "\nshe shoved me into a escape pod and then went to see how she could help the others. That's who she was. I"
				+ "\nguess I blacked out in the pod, and when I came to, I was here", 4, 7, 6, "Describe \"here\"","Want to"
				+ " talk about Colby?"));
		//level 5
		list.add(new Story("Yeah, I believe so. My suit tells me I'm good - and I hope to stay that way. I don't want to die on"
				+ "\nthis big rock, or whatever the hell it is.\n...\nbut ... I don't know who else made it. Colby - she - "
				+ "\npushed me into an escape pod and then went to see how she could help the others. That's just who she was."
				+ "\nI blacked out in the pod, and when I came to, I was here.", 5, 7, 6, "Describe \"here\"", "Want to talk about"
				+ " Colby?"));
		//level 6
		list.add(new Story("Nah, I'm good. I'm just really overwhelmed right now. Instead of of going over happy memories, I would"
				+ "\nrather find out how to survive in this shit hole. If I do survive this, I'll tell everything about my whole"
				+ "\ngoddamn life.", 6, 8, 7, "Ok, I'll try my hardest to get you outta here.", "Describe where you are right now."));
		//level 7
		list.add(new Story("All right, so, my escape pod came down in some kind of desert. The ground is all cracked white rock."
				+ "\nThere's a huge white peak a few miles away. Or, uh, kilometers, I guess. They tried to get me to think"
				+ "\nmetric for the trip. but some things are just hardwired. It's weirdly symmetrical, like it might not be"
				+ "\na natural formation. My IEVA suit's compass places the peak northeast, and then, in the opposite direction"
				+ "\n-- south and southwest to be precise --"
				+ "\nare two funnels of black smoke from what I have to assume are two pieces of the Varia. Best case scenario,"
				+ "\nits ONLY in two pieces. "
				+ "\n The crash site looks close than the peak. What do you think I should do?", 7, 11, 12, "Check the crash.",
				"Head for the peak."));
		//level 8
		list.add(new Story("Hey, if this all turns out for the best, maybe we can all go get some coffee sometime. I'm buyin'. "
				+ "\nOh hell, if I make it out of this alive, I'll have earned something a lot stronger than coffee!", 8, 9, 7, 
				"Sounds good.", "Describe where you are right now."));
		//level 9
		list.add(new Story("Yeah, anything sounds good after the Varia's rations. Speaking of which, I'm gonna want to find"
				+ "\nsomething to eat and drink before long. I have this theory that if I just built an intersection here, competing"
				+ "\nStarbucks would magically appear on at least two of the corners. But I'd hate to do all that work just to"
				+ "\nbe proven wrong.", 9, 10, 7, "Save your energy.", "Describe your surroundings."));
		//level 10 - ending 1 death
		list.add(new Story("[10 hours later]"
				+ "\nhey man ... i ... i ... i really don't know why i was stupid enough to listen to your advice. Stay here?"
				+ "\nAnd do what?"
				+ "\nso that coffee we spoke about, guess thats never gonna happen, huh?"
				+ "\n[IEVA suit detects foreign poision in blood stream]"
				+ "\n[connection weak]"
				+ "\n[connection lost]", 1));
		//level 11
		list.add(new Story("Yeah, cool, that makes sense. There might be other survivors... fingers crossed."
				+ "\n(It's not actually possible to cross your fingers in an IEVA suit, but just take my word on it.)"
				+ "\nAt the very least, there should be some supplies I can use."
				+ "\nOkay, I'm headed south now. Looks like the smoke is at least an hour away. Or whatever the metric equivalent"
				+ "\nof an hour is."
				+ "\nI'll let you know once I'm there."
				+ "\n[Taylor is busy]"
				+ "\nHoly crap. It's a lot further than it looked. My legs feel like Jell-O, and I'm maybe halfway there."
				+ "\nGreat. And now all I can think about is how much I want Jell-O"
				+ "\n[Taylor is busy]"
				+ "\nOkay. At long last. I'm in sight of the Varia, Or what's left of it, at any rate."
				+ "\nIt seems to have cracked hard once it hit the atmosphere."
				+ "\nLike I figured, it came down in two major chunks..."
				+ "\n...with a ton of scattered debris thrown around just to make the whole scene look more terrifying and post - "
				+ "\napocalyptic. (In case anyone asks, it's working: I'm terrified."
				+ "\nLooks like the flight deck came down pretty far from the creq quarters. Where do you figure I should go first?",
				11, 16, 17, "Look for the crew.", "Check the flight deck."));
		//level 12
		list.add(new Story("You think? It's a lot farther away than the crash site."
				+ "\nI'm not sure I'll make it there before nightfall.", 12, 13, 11, "Better get moving, then.",
				"Okay, head for the crash site."));
		//level 13
		list.add(new Story("All right, I guess I have to start somewhere."
				+ "\nHey. I, uh. I appreciate the advice. It's just food to have any sense of direction at all. out here."
				+ "\nAnyway... looks ilke this hike could take a while."
				+ "\n[3 hours later]"
				+ "\nDamn! Looks like the path is blocked off. I was tracing this shallow canyon, but I hit this huge boulder."
				+ "\nWay too big to climb over. What do you figure... should I look for some way around it, or head back to the crash?",
				13, 14, 11, "Find a way around.", "Head back to the crash."));
		//level 14
		list.add(new Story("Okay, I'll give it a shot. This is pretty rough terrain though."
				+ "\n[Taylor is busy]"
				+ "\nListen, there's just no way around this thing."
				+ "\nNot enough footholds to get even a few feet up. Or \"meters\" up it. whatever."
				+ "\nAnd - surprise, surprise - as a science fair champ, I'm pretty much the definition of an \"indoor.\" kid",
				14, 11, 15, "Might as well head back.", "Give climbing a try."));
		//level 15 - ending 2 death
		list.add(new Story("I really... aw. screw it."
				+ "\nOkay, I've come this far, no sense in giving up now. Here goes nothing!"
				+ "\n[Taylor is busy]"
				+ "\nah no i broke my leg"
				+ "\noh god its a compound its the bone is sticking right through this ieva suit"
				+ "\nive never broken a bone in my life and now this"
				+ "\noh my god shouldnt i go into shock at some point cause the pain is freaking overwhelming"
				+ "\nhey no offense but your advice? sucks"
				+ "\n[connection lost]", 15));
		//level 16
		list.add(new Story("All right, I'm headed that way. If there are any rations to be found, that's where they'll be."
				+ "\nThings look kind of messy though. Give me a minute to scout around."
				+ "\n[Taylor is busy]"
				+ "\nOkay. Okay. Well, this wasn't unexpected, but still."
				+ "\nI. uh... I found some of the crew."
				+ "\nIt's... oh, man. Hang on"
				+ "\n[Taylor is busy]"
				+ "\nSorry about that. I had to go be sick behind some moon rocks."
				+ "\nSo, there were a few crew members who were apparently pretty near where the Varia's hull split."
				+ "\nI can't... I can't tell who they were, or how many."
				+ "\n They're all sort of fused, to the metal, or, uh, to each other."
				+ "\nAnd we, I don't know, we might've lost some crew when we lost pressure."
				+ "\nAntoine, Trotter, Colby, Adair. All dead. All of them, just... dead."
				+ "\nI don't see Captain Aya anywhere. I don't know..."
				+ "\nI... I don't think I can do this. Knowing that all of them, every one of them... I just...", 16, 18, 17,
				"Honor the dead.", "Just keep moving."));
		//level 17
		list.add(new Story("All right. It's gonna take me a few minutes to sort through the wreckage."
				+ "\nA lot of the heat shielding was stripped on entry, but it seems to have taken the worst of the damage."
				+ "\nMost of the instrumentation looks surprisingly intact. "
				+ "\nLet me poke through this mess..."
				+ "[Taylor is busy]"
				+ "\nHot damn! We're in business!"
				+ "\nSo, let's play a round of Good news/Bad news."
				+ "\nGood news: I found the ship's distress beacon, and from what I can tell, it's totally intact!"
				+ "\nWhich means, hey, maybe I won't be stuck here forever."
				+ "\nMore good news: One of the defense turrets is still operational. "
				+ "\nSo that means if the little green men DO come poking around, I'll have more than a smarmy pop-culture"
				+ "\nreference to defend myself with."
				+ "\nBut now for the bad news: I've got no power for either the beacon or the guns. The reactor came down with"
				+ "\nthe back half of the ship. I'm going to keep hunting in this end of the Varia and see if I can dig up some"
				+ "\nkind of alternate power source."
				+ "\n[Taylor is busy]"
				+ "\nOh.... oh, no. I had't found any of the crew up here near the flight deck, but... I just found Captain Aya."
				+ "\nThere's just... so much blood, I wouldn't have thought..."
				+ "\nShe's lodged under this big chunk of... I don't care at this point what she's under. I never knew what the"
				+ "\nengineers called these things anways. We all had massive respect for the Captain. Should I pull her out or"
				+ "\nsave my energy?", 17, 20, 21, "Let her be. You can show her respect by surviving and getting out of here.",
				"Get her out of there. Show your cap'n some respect."));
		//level 18
		list.add(new Story("Yeah, you're right. I should... bury them, or something, huh?"
				+ "\nThere's got to be, like, a spafe or some kind of... something to dig with."
				+ "\nMan ,this is gonna take some work. Maybe I should keep exploring the rest of the ship, see if I can find"
				+ "\nsome rations first. I'm pretty much running on fumes, here", 18, 17, 19, "Makes sense, Keep exploring.", 
				"Dig now. Explore later."));
		//level 19 - ending 3 death
		list.add(new Story("Okay, I guess you're right. These are good people, they deserve a proper memorial."
				+ "\nI'll tell ya when I'm done. First I need to find a shovel or something."
				+ "[Taylor is busy]"
				+ "\noh man... so i took this piece of metal to dig with... it seemed just like a regular piece of sturdy metal."
				+ "\nbut guess what, it wasnt. it was some freak element on this rock that did... it did something to me..."
				+ "\nand now i cant breathe... idk what happened... i guess my fate was to die on this rock"
				+ "\n[IEVA suit detects foreign poison in blood stream]"
				+ "\n[WARNING: IEVA SUIT DETECTS LOW OXYGEN LEVELS]"
				+ "\n[connection lost]", 19));
		//level 20 - ending 4 death
		list.add(new Story("[2 days later]"
				+ "\noh man... i tried everything... i should have pulled captain aya out... maube... jusr matbe..."
				+ "\nshe might been alvie ... snd... seh coudfl have helded us..."
				+ "\n[connection lost]", 20));
		//level 21 - only winning
		list.add(new Story("[a couple of hours later]"
				+ "\nWould you believe it! Captain Aya knew about some extra power sources that weren't damaged."
				+ "\nAnd just IMAGINE! There was a single patriock generator with just enough power left to send an SOS signal. Luckily,"
				+ "\na patrol ship was out near the Jeggy-09-FKY galazy and they were able to pick us up within no time. It's all thanks"
				+ "\nto you buddy. cya out there somewhere. And remember, my coffee deal is still out there. :)", 21));
			
	}

}
