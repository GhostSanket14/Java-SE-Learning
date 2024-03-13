package highLevel_Algos;

// FUCK, chatGPT, I wrote my own HashFunction. Its simple but works.
// A code to check for patterns in the string.
public class PatternSearching_HashFunction {

        
    public static void rabinKarp(String text, String pattern) {
        int textLen = text.length();
        int patternLen = pattern.length();
        int patternHash = hash(pattern, patternLen);
        int textHash = hash(text, patternLen);
                
        for(int i = 0; i <= textLen - patternLen; i++) {
        	if (patternHash == textHash && checkEquality(text, i, pattern)) {
                System.out.println("Found at index " + i);
            }
            if (i < textLen - patternLen) {
                textHash = updateHash(textHash,text.charAt(i),text.charAt(i+patternLen));
            }
        }
    }

    // Hash function for a substring of specified length
    private static int hash(String str, int length) {
    	int hashValue=0;
    	for(int i=0; i<length; i++){
    		hashValue=hashValue+str.charAt(i);
    	}
    	return hashValue;
    }

    // Update the rolling hash for the next substring. (Instead of calculating new hash every time, we remove old and add new ).
    private static int updateHash(int OH, char oldc, char newc) {
    	int hashValue=0;
    	hashValue= (OH-oldc)+newc;
    	return hashValue;
    }
    
   
    // This is better then using equals, as this means we can avoid using 2 built in functions. (.equals() & .substring())
    private static boolean checkEquality(String str1, int start, String str2) {
        for (int i = 0; i < str2.length(); i++) {
            // Compare characters of the two substrings
            if (str1.charAt(start + i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        String text = "batmanandrobinarebat";
        String pattern = "bat";
        rabinKarp(text, pattern);    	
        System.out.println("^1");
        
        String text1 = "fxtlsgypsfa";
        String pattern1 = "tlsgyp";
        rabinKarp(text1, pattern1);
        System.out.println("^2");
        
        String text2 = "repggxrpnrvystmwcysyycqpevikeffmznimkkasvwsrenzkycxfxtlsgypsfadpooefxzbcoejuvpvaboygpoeylfpbnpljvrvipyamyehwqnqrqpmxujjloovaowuxwhmsncbxcoksfzkvatxdknlyjyhfixjswnkkufnuxxzrzbmnmgqooketlyhnkoaugzqrcddiuteiojwayyzpvscmpsajlfvgubfaaovlzylntrkdcpwsrtesjwhdizcobzcnfwlqijtvdwvxhrcbldvgylwgbusbmborxtlhcsmpxohgmgnkeufdxotogbgxpeyanfetcukepzshkljugggekjdqzjenpevqgxiepjsrdzjazujllchhbfqmkimwzobiwybxduunfsksrsrtekmqdcyzjeeuhmsrqcozijipfioneeddpszrnavymmtatbdzqsoemuvnpppsuacbazuxmhecthlegrpunkdmbppweqtgjoparmowzdqyoxytjbbhawdydcprjbxphoohpkwqyuhrqzhnbnfuvqnqqlrzjpxiogvliexdzuzosrkrusvojbrzmwzpowkjilefraamdigpnpuuhgxpqnjwjmwaxxmnsnhhlqqrzudltfzotcjtnzxuglsdsmzcnockvfajfrmxothowkbjzwucwljfrimpmyhchzriwkbarxbgfcbceyhjugixwtbvtrehbbcpxifbxvfbcgkcfqckcotzgkubmjrmbsztsshfroefwsjrxjhguzyupzwweiqurpixiqflduuveoowqcudhnefnjhaimuczfskuiduburiswtbrecuykabfcvkdzeztoidukuhjzefczzzbfkqdpqzikfobucdhthxdjgkjelrlpaxamceroswitdptpcclifkeljytihrcqaybnefxnxvgzedyyhngycdrudmphmeckotrwospofghfozqvlqfxwwkmfxdyygmdcaszsgovsodkjghcwmbmxrmhuyfyqgajqkcklznayxqkqoyzwmyubzazcpkhktkydzivcuypurfmbisgekyrgzvxdhpoamvafyrarxsvkhtqdihersigbhzjzujxmmyspnaraewkegjccvhhrjvbjtsqdjootgpknfpfycgfieowqrwwwpzsqmetogepspxnvjiupalyynmkmnuvklhsecdwracgfmzkgipdfodkjmjqwiqpuoqhimvfvuzwyvijgfullkjduhsjafbtlkmfqrmyjfjnhhssqctydteamdcjbprhtnegyiwxgcjwlgrsmeaearwtvjsjbaoiojlwhypnvruihoswkifygtydhacwyhsgewzmtgonzltjhgauhnihreqgjfwkjsmtpjhaefqzaauldrchjccdyrfvvrivuyeegfivdrcygurqdredakubnfguproqylobcwqxkzmausjgmhcmhgdnmphnqkamhurktrffaclvgrzkkldacllteojomonxrqyjzginrnnzwacxxaedrwudxzrfusewjtboxvynfhkstcenaumnddxfdmvzcautdcckxaaydzsxttobbgqngvvpjgojoglmkxgbfcpypckqchbddzwrxbzmqrlxvobtwhxginfgfrcclmznmjugwwbsqfcihubsjollmsqsghmcphelsotflbgsfnpcuzsrupchynvzhcpqugriwniqxdfjpwpxfblkpnpeelfjmtkuqpzomwnlmbupmktlptndmpdsydsgvfpenemwborifsuqhceskmkhssmvnonwafxwhgbibabvqopqfoviussqfqwehtxdzujtlntxmrjxxwtlggkytbiolydnilqadojskkvfxahhjmbocljarintdwcldvdxropbyjzwyyojuothwmlvrglfzdzdbtubxuoffvncrswsaznmoijoivvgobqpnckwvnhkebmtdhvygkjisuxhatmuudqbhmknhfxaxqxkjlzzqtsjfaeedfuujkolxjoqkdvfepvlhvhrwtfdukxffjpsswyxlijjhevryxozbafpfmowgrgonuatdqlahyggyljddjhmltedzlodsrkeutgtnkntarjkpxinovgzdthunwooxvjjmpsvknhkwjopmmlebksucvzqlyqnwcmbvbhrmlowpjbwyvwtgtoqnmicxapzarknnxtuufarzrosdqwsmtcjghecqudosrtjxyaaykqrxycrxuwjxnpqjnbkcpdmokalxapemvbqlzsvxzkutappwgzpdpyzkzcvbntcvfxsxpjaoxtfhvxxytgokrcxaetauqgndmphwzyiayabjrqgeppxyjsttyzuvldvybsuxkbmfzvrtnovidznpghozvafmsnsnqivmvubcwtfsrqtmknepbhowejazhkwcmmtpixxxlzqysxtwwtaidyaxyqleprxibexxyfvsddygthcuyyfwpjsfybglgzmbintattnhodtonpyzwotkgnguphpkxeatowzabsdnvqhkfcmofisfrfqgvpmvorpjfzslzmpjjnehrykxjzubuacclfkcyzobghtuoxrajvprecwgxxpswcgmmvedewdmfnqwcuqdsciliqecihluilgmfcswtwkkxlcbhqkvcswjebkrjlpgfgratzbsguvzifnhyxwjsjavwauxpannamxjdvzuhnaczyhepwzolhuslrkvwpnvgzmiizwudwdfzlktbqdxgyyiudsjvezkmesbjlkyertahnexhuqmjicbmusqdklasolwjxptxxeumzfwyucpabqseffunqpkfnnbecbbcjpdyjlibitllplxelrdkexdtquvptteyhtlqlbbbvoqozkynayyrbaqmyjhzxndsiyfsexwbioewqvqrtcdlpqmvjifvgymkgotzjmnzqtmrpndevnmthjitsspaqnjrdoyjwpyatmleyqsvkpamsvbmvxrllivfedkjigavyxjveqvrbacuigaipyhbbxipbzncwhrblirizxoqptqqweaafjeqiozpyfauuqmvhxkmnxmsyamptlzanotlslwuhtfqjrrwbwhmqhzkhdkcrfvbeiyipvfvpzhyujabtqwwtbkdogkemhibyxrnxsxrzletbqexkrqoiernaplqyjpqoubvjsebalwnksvloidzfpirwycztwzzvewxotakudkpedupkczlhwuskdnevdcplbklpjmpfdcyqtrcvvvtrffvpekkqmcupryjauteuvczvicthrxsxclprgdlwxfaigayrueicufdiamhtkbxotdirxxgvzqmeyrovfichqnivfjzauqfdftgmopsrgpugxtuhlcvspihazrssfszwxbqmurwmxcdbhumrgjqmvnkyrtnsjvwzxssqxnjomuyjnjuwrsyxwqyyxcszpoklwjdrltbsciedpiwlaqigesjsqhsjlrglmwanrxrfnwakztgjhxaunfqjvxiohnjqrjshymdovwgefhjesvhtiziojljdpmoxbyuyopqjkztvjgkwxkewpzhbjsuthsyoefjgwwyeozluhmgabbsqrhcrtxmjvcaxxsufahyyayzkhuhjrjsvoqhtydwpbszxsbziyrvgqmlunwscpirzfcbtseplkgwfkhrouoysrwmqojahyqmfevsdcomryhgdmlxukwyzcprskwgxulsuckbsepjeiszsgcezwapqrvlwigrovjcdzxxphqlsrzihmgzrioqrqetkzfbldjiemsfzbhzfnwywmxxgdpylraxglmtbiylbhcwhlsyoyhgmgopprzaxqmomsyhgagiupjqbzxthtopotmitnqwtoetonxwzghutifklgklrnuwkmsyqcpuivahqatmsckmaalkicsnxucovtykrxawzadjxwxqmndhldttxsknxteznjsqtfbccfqmwhbvssiigvijsuxiicaahmkwywttjzppkwlbmjahtputiebpbbmuegyrhlthxwgjprwvhshzyavqyecztozoabnanhrrbddndodxeuiozioiuozxqtihwauroqrdqwcvlxzipodiispqnzomcwvaptgrgdfnyytkwwqqtmiuuyvgaihfshccxhuuyyhtgdglfciebdutoeunfhdaxphbsywztpwjngjncpxrjvbvccefkbemgsdymzmmkwdehfkruqbyvecmpesromdxllubryyeshqlzmrewqnkqitxgiigquskwtcznlterxbltzydyzvahnkixjwzztdjpqsuowkvfccockvrjbfrjpcgdjdrwdnposrjgdrqrvqtvppazhltjqvcclpeztsjpynzfrotqpoxmwhhwewnvcbvdkuzififrtwqqeojueqbnskwzeewzkaojursqgsczvhhujzumigofhwbkkfluwzkctkagxksmfauwinsjlsojtrxhwmhlvbypecjeiwwstneuiqubpgugwgnmikdwickdilsnpdqsvmterdfblhwbafbgarcsfijylbiimofgxeirpbtywqzapkkcafcomvntmdhzxlefppyebeoeqznbhycwmfyaqqiannyhqouizveavgzjwoblsgwnkvjlnivqcwvzxtcthynmuxqkwwmtfisgglgcoxpipytdbamrykbokmwgsddpqkrzyjchztmiepagwhroqkhwudbcihpqwaqzxugkvakvlavkswfzsdbvqidhtbcdeytmpphkuhsxorpufwhjrutksslhlrxlydxvkosaggmpbgzvbafazjohqsswtorckqaxsrehnrlyjiwtmhglkozfkmmxtyvoxhfkxopvybjzoxhzubdntoamzottcjtuegmpqkcdbbgckjqtebichznpprqiswbdhoyncsaetlgbfviocfwxwdrnlffbfhvyxzukjwocyhzqjzdhtbrrrllktchfnctpirnawonydwwvuabuqcimcnlhqodemakmunmaxiomkeywcofqbkdmzoizgqipzayixrydwsovhztkgzskwptkqcexrnnxskywndqizlzklnissamqazhlndnviltkoiafmeicgguzxhrdjzzheruswavnvslonoasrudrnldkldkfztagienatjzwxclkkulncaqptoneqlnbtoddbmivazxzmcojdhiswkaxiagtutafrsvpphuraaaixztwdyruumqadjepvvcvoidwmtpbnmquiopiwpuwczdapdzghavviyirojnolsowrmvvjiqswricmzsxavdqamnfhwfgeohskkefutxxibhpulnlwxqwwzdgdjgeqwapbhlpudoemnntpouahgxjhzjbeplttriabwucrjmbvbozvmxobatkhqsqchlhtbofuikwafkcowuuntfhpkdeyhokquwqvwtthhhugjzmfeuinipbncizockaadalljreqtkhudblprzlsrwxoccslutwqzsqtijvcwnpflrlukdiaohqjhraglgriykldkdfrdrxjstcwrsxgywfnhcbkpmesupmtrvipfbktbwzfahoevnhxbrhhfobgywcvhktdoxqtekiwwurzblmldlfibdvemunnlxubykvvrgktrerptisizxhrevnxquezxkugroohrhudidgvhtjhyezkyhpfxwgprpseaccxkwvixvfhqfawkfdjpyeevdggatfiekixeyrfcpxscjkcfgqmyhjmjtimdspizhwzizcyuceglmmbgygfvtqvzqatxlgibyzzkiajxmbhmkqlwhqnghlvlzgppxooeoqxppbpmblxnkeofmniumjcafcuyvdcueterqpjjwaknkxtlzqfljnwkxgkfylnukbiysplkhjucfuwohzvphjbjyovdlnbfrkvbemwytfjynqmgzagbkwekkouxdcynkhtosfytlucentoilfuldvrxlonvkxzecxepkmzzgxluahmjyecsldjesdcpjikvpaudvkxgllisaambovjkdqrkdorjfnyghhhptzifawftzqgemnhpqyictmoyfpcvkcaodakjacqauzyowdzsfqhkplfbyzmnimdlxmjydaxyjnecxsjjbhiqnvocdenqmwilxxzoqfotpikpqudmomikppzhdhfqsgbxiisyzwnhxyfvydfmpdwomciudcnyndgcnfjitppmymxiisnebpywsgqsxdjplwzfmjoopyyifvkmwwpgpljeawpvapihoxuuffbrwhpevcoqrgrqwzhibnorkhzmlbzfhxunrklibvpszznopfgaxzgfltlsxbtumilocltgcozgtziufuzimxeekwnysbicrfxdiogcseozpscrhjotyczcwmbaaolsvubpylonmwajgxzgyzaovenfvocikqjtxgvenksppwwplhxtgybvmajeyfaxegseijikcmduclaaioissisiyppnzdubptsaveszsippqmotjhkudnvqzbkatnefulgexktrmhddapswptfvovujiuwbmibructtmrvznjrchjwzwmozecrznjkfrvkrmrdwroaocqpktlmwxwtnuamqelrwbgbijilnhiiulltovbeflwlpbhyffhbavhfuahlindjdfpekxglixlaxxtolhglvwxkyvulcyjeflloqzhltmgtujdcuugnrotlotcpbnyfhejegcmfptqmveghmfbmvklsqfubvxctepvmljohzxxoolnvlayguokqdauptyvjafzzkqtaxjlrbrukkkigjmxqrbazlpdevpezpbwshvpckldqgivlqpirqvwqquyxpixqireuqamffsvvntguxesidrnwwtqkdozfpkduulifzdpohcgubkurehrqbbxajefbfhkzbpkapbszyspdaaoxraojotjufsturtjhudpetsgrzuigusnwlyrvfnkkmsdbuhvhfqtdvtnlewfquuhtainkebbvzhtqbkdbmvhbsnjbtvjtqnbchiwfuqlzsmxvfjtvquitivyhzpxcdjwikfatcanchxssjluhlyoebcgnsqfzxxwgliuejobcfpvnyrrpkegeqpvlhxeeocmerjmziudtsqqozvejnrtibvnjepfqdsmvstmmwwwqknnrmqmjccpaowazfeurgpbfryedqjrltmymhysoicwuohferebeacazuvjoxyipmsgufjiwlcfywxteyyqdhxwjhiudghyxyoxbsceftdrqelxfvcfbbjjyfsvkvsapdshakgdvhcfmceztgjcmhxlhasqkauqlnfhggtagrnffmnpinwlexrqxisbfnhjzqvoxkukylzcrupmibacpjzsnaclmnuqnbdifzlujqvnfjxxvkczfkzzjqnaqpohygjsjtakzrsosyqhquhkjcjyugtedogfurkxiyqufotiajmwhyilthmoevlwlrxpwpzhsvbfzvtvhwycfznmaomafsyvyrqpizteuoxgthfxsmxjrwpsursgwthhilgdhzfzaxadtklhyhqzfdimsrueecxkqkrudlmzgdtnhmivnnkclgarygydqdhltrsthidzyqazfnovktqcotchcolineiytymr"; // 17
        String pattern2 = "zfnovktqcotchco";
        rabinKarp(text2, pattern2);
        System.out.println("^3");
       
    }
}