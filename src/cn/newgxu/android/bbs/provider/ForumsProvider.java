/*
 * Copyright (c) 2001-2013 newgxu.cn <the original author or authors>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package cn.newgxu.android.bbs.provider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * �ṩ��̳�������ݣ�ע�⣬����content provider!
 * 
 * @author longkai
 * @email im.longkai@gmail.com
 * @since 2013-5-22
 * @version 0.1
 */
public class ForumsProvider {

//	public static final String[] AREAS = {};
	
	public static final String NAME = "name";
	public static final String ABOUT = "about";
	public static final String FID = "fid";
	
	public static final List<Map<String, String>> AREAS = new ArrayList<Map<String,String>>();
	public static final List<List<Map<String, String>>> FORUMS = new ArrayList<List<Map<String,String>>>();
	
	static {
//		վ�����
		Map<String, String> area1= new HashMap<String, String>();
		area1.put(NAME, "վ�����");
		List<Map<String, String>> area1Forums = new ArrayList<Map<String,String>>();
		
		Map<String, String> area1Forum1 = new HashMap<String, String>();
		area1Forum1.put(NAME, "�������");
		area1Forum1.put(ABOUT, "�Ͻ���ˮ,ֻ����վ����������Ĵ������顣");
		area1Forum1.put(FID, "1");
		area1Forums.add(area1Forum1);
		
		Map<String, String> area1Forum2 = new HashMap<String, String>();
		area1Forum2.put(NAME, "��������");
		area1Forum2.put(ABOUT, "��ӭ��ʱ��;��������Ѽ������ǵĹ����Ŷӡ� ����������ζ��һ�ּ�ֺ����Σ�����ǰ��˼֮����֮��");
		area1Forum2.put(FID, "14");
		area1Forums.add(area1Forum2);
		
		Map<String, String> area1Forum3 = new HashMap<String, String>();
		area1Forum3.put(NAME, "�ٱ�����");
		area1Forum3.put(ABOUT, "�ٱ�����");
		area1Forum3.put(FID, "66");
		area1Forums.add(area1Forum3);
		
		Map<String, String> area1Forum4 = new HashMap<String, String>();
		area1Forum4.put(NAME, "��̳Ͷ��");
		area1Forum4.put(ABOUT, "��̳Ͷ��");
		area1Forum4.put(FID, "93");
		area1Forums.add(area1Forum4);
		
		Map<String, String> area1Forum5 = new HashMap<String, String>();
		area1Forum5.put(NAME, "�ͷ���¼");
		area1Forum5.put(ABOUT, "�ͷ���¼");
		area1Forum5.put(FID, "105");
		area1Forums.add(area1Forum5);
		
		FORUMS.add(area1Forums);
		AREAS.add(area1);
		
//		��������
		Map<String, String> area2 = new HashMap<String, String>();
		area2.put(NAME, "��������");
		List<Map<String, String>> area2Forums = new ArrayList<Map<String,String>>();
		
		Map<String, String> area2Forum1 = new HashMap<String, String>();
		area2Forum1.put(NAME, "У԰�۽�");
		area2Forum1.put(ABOUT, "�������գ������ǵĹ�ע��Ѥ�������ǵ�У԰�����ҵľ۽������ˡ�");
		area2Forum1.put(FID, "10");
		area2Forums.add(area2Forum1);
		
		Map<String, String> area2Forum2 = new HashMap<String, String>();
		area2Forum2.put(NAME, "����ר��");
		area2Forum2.put(ABOUT, "ӭ��ר��,��ӭ����������,Ҳ��ӭ�������ش�����������!");
		area2Forum2.put(FID, "131");
		area2Forums.add(area2Forum2);
		
		Map<String, String> area2Forum3 = new HashMap<String, String>();
		area2Forum3.put(NAME, "У���ٵ�");
		area2Forum3.put(ABOUT, "У���ٵ�");
		area2Forum3.put(FID, "48");
		area2Forums.add(area2Forum3);
		
		Map<String, String> area2Forum4 = new HashMap<String, String>();
		area2Forum4.put(NAME, "У��֮��");
		area2Forum4.put(ABOUT, "��ӭУ�ѳ��ؼҿ�����");
		area2Forum4.put(FID, "110");
		area2Forums.add(area2Forum4);
		
		FORUMS.add(area2Forums);
		AREAS.add(area2);
		
//		���ŷ��
		Map<String, String> area3 = new HashMap<String, String>();
		area3.put(NAME, "���ŷ��");
		List<Map<String, String>> area3Forums = new ArrayList<Map<String,String>>();
		
		Map<String, String> area3Forum1 = new HashMap<String, String>();
		area3Forum1.put(NAME, "������");
		area3Forum1.put(ABOUT, "���ŷ��");
		area3Forum1.put(FID, "81");
		area3Forums.add(area3Forum1);
		
		Map<String, String> area3Forum2 = new HashMap<String, String>();
		area3Forum2.put(NAME, "��ѧ����");
		area3Forum2.put(ABOUT, "��ѧ����");
		area3Forum2.put(FID, "146");
		area3Forums.add(area3Forum2);
		
		Map<String, String> area3Forum3 = new HashMap<String, String>();
		area3Forum3.put(NAME, "�黭Э��");
		area3Forum3.put(ABOUT, "����һ�����������ܴ����һ�����������");
		area3Forum3.put(FID, "137");
		area3Forums.add(area3Forum3);
		
		Map<String, String> area3Forum4 = new HashMap<String, String>();
		area3Forum4.put(NAME, "�Ƽ�Э��");
		area3Forum4.put(ABOUT, "ͬ������Ƽ��� ����ѧ���Ƽ�ʷ");
		area3Forum4.put(FID, "139");
		area3Forums.add(area3Forum4);
		
		Map<String, String> area3Forum5 = new HashMap<String, String>();
		area3Forum5.put(NAME, "����Э��");
		area3Forum5.put(ABOUT, "���ְ�����Э��");
		area3Forum5.put(FID, "134");
		area3Forums.add(area3Forum5);
		
		Map<String, String> area3Forum6 = new HashMap<String, String>();
		area3Forum6.put(NAME, "����Э��");
		area3Forum6.put(ABOUT, "������Ψ���貵��ǿգ������ǵ�������Ϣ����");
		area3Forum6.put(FID, "160");
		area3Forums.add(area3Forum6);
		
		Map<String, String> area3Forum7 = new HashMap<String, String>();
		area3Forum7.put(NAME, "���Э��");
		area3Forum7.put(ABOUT, "���Э��");
		area3Forum7.put(FID, "132");
		area3Forums.add(area3Forum7);
		
		Map<String, String> area3Forum8 = new HashMap<String, String>();
		area3Forum8.put(NAME, "�����о���");
		area3Forum8.put(ABOUT, "�����о���");
		area3Forum8.put(FID, "135");
		area3Forums.add(area3Forum8);
		
		Map<String, String> area3Forum9 = new HashMap<String, String>();
		area3Forum9.put(NAME, "���г�Э��");
		area3Forum9.put(ABOUT, "���г�Э��");
		area3Forum9.put(FID, "133");
		area3Forums.add(area3Forum9);
		
		Map<String, String> area3Forum10 = new HashMap<String, String>();
		area3Forum10.put(NAME, "����־Ը��Э��");
		area3Forum10.put(ABOUT, "���� �Ѱ� ���� ����");
		area3Forum10.put(FID, "178");
		area3Forums.add(area3Forum10);
		
		FORUMS.add(area3Forums);
		AREAS.add(area3);
		
//		��������
		Map<String, String> area4 = new HashMap<String, String>();
		area4.put(NAME, "��������");
		List<Map<String, String>> area4Forums = new ArrayList<Map<String,String>>();
		
		Map<String, String> area4Forum1 = new HashMap<String, String>();
		area4Forum1.put(NAME, "��������");
		area4Forum1.put(ABOUT, "���������������˵��");
		area4Forum1.put(FID, "5");
		area4Forums.add(area4Forum1);
		
		Map<String, String> area4Forum2 = new HashMap<String, String>();
		area4Forum2.put(NAME, "������ͼ");
		area4Forum2.put(ABOUT, "��ʲô��ͼƬ���ҹ�����");
		area4Forum2.put(FID, "11");
		area4Forums.add(area4Forum2);

		Map<String, String> area4Forum3 = new HashMap<String, String>();
		area4Forum3.put(NAME, "���ɷ���");
		area4Forum3.put(ABOUT, "��ˮ�����й���");
		area4Forum3.put(FID, "9");
		area4Forums.add(area4Forum3);
		
		Map<String, String> area4Forum4 = new HashMap<String, String>();
		area4Forum4.put(NAME, "��Ʒʱ��");
		area4Forum4.put(ABOUT, "��COOL��ʱ���³�����ǰ����װ�������µ�FASHION SHOW���ھ�Ʒʱ�У�");
		area4Forum4.put(FID, "13");
		area4Forums.add(area4Forum4);
		
		Map<String, String> area4Forum5 = new HashMap<String, String>();
		area4Forum5.put(NAME, "��Ϸ����");
		area4Forum5.put(ABOUT, "��Ϸ����");
		area4Forum5.put(FID, "20");
		area4Forums.add(area4Forum5);
		
		Map<String, String> area4Forum6 = new HashMap<String, String>();
		area4Forum6.put(NAME, "�ֻ�����");
		area4Forum6.put(ABOUT, "�ֻ���mp3,dc,dv��4���...");
		area4Forum6.put(FID, "70");
		area4Forums.add(area4Forum6);
		
		Map<String, String> area4Forum7 = new HashMap<String, String>();
		area4Forum7.put(NAME, "¿������");
		area4Forum7.put(ABOUT, "¿������");
		area4Forum7.put(FID, "98");
		area4Forums.add(area4Forum7);
		
		Map<String, String> area4Forum8 = new HashMap<String, String>();
		area4Forum8.put(NAME, "��ʳɳ��");
		area4Forum8.put(ABOUT, "��������ʳ��Ʒ��ζ������������ʳɳ��");
		area4Forum8.put(FID, "99");
		area4Forums.add(area4Forum8);
		
		Map<String, String> area4Forum9 = new HashMap<String, String>();
		area4Forum9.put(NAME, "Ӱ�ӳ���");
		area4Forum9.put(ABOUT, "����Ӱ�����ǲ���������ĥʱ�⡭");
		area4Forum9.put(FID, "108");
		area4Forums.add(area4Forum9);
		
		Map<String, String> area4Forum10 = new HashMap<String, String>();
		area4Forum10.put(NAME, "��Ӱ���");
		area4Forum10.put(ABOUT, "��Ӱ���");
		area4Forum10.put(FID, "119");
		area4Forums.add(area4Forum10);
		
		FORUMS.add(area4Forums);
		AREAS.add(area4);
		
//		�Ļ�����
		Map<String, String> area5 = new HashMap<String, String>();
		area5.put(NAME, "�Ļ�����");
		List<Map<String, String>> area5Forums = new ArrayList<Map<String,String>>();
		
		Map<String, String> area5Forum1 = new HashMap<String, String>();
		area5Forum1.put(NAME, "��������");
		area5Forum1.put(ABOUT, "�������̬������ɽ֮�������������ģ��﴿��������");
		area5Forum1.put(FID, "4");
		area5Forums.add(area5Forum1);
		
		Map<String, String> area5Forum2 = new HashMap<String, String>(3);
		area5Forum2.put(NAME, "�������");
		area5Forum2.put(ABOUT, "����������������ֵ�����ǻ����...�㻹�ǵ����ǵĶ�����");
		area5Forum2.put(FID, "57");
		area5Forums.add(area5Forum2);
		
		Map<String, String> area5Forum3 = new HashMap<String, String>(3);
		area5Forum3.put(NAME, "�ƻ�����");
		area5Forum3.put(ABOUT, "���ǵ�����ƻ�");
		area5Forum3.put(FID, "60");
		area5Forums.add(area5Forum3);
		
		Map<String, String> area5Forum4 = new HashMap<String, String>(3);
		area5Forum4.put(NAME, "��������");
		area5Forum4.put(ABOUT, "�����һ���ƣ�����ҹ��ʮ���");
		area5Forum4.put(FID, "107");
		area5Forums.add(area5Forum4);
		
		Map<String, String> area5Forum5 = new HashMap<String, String>(3);
		area5Forum5.put(NAME, "ʷ����ɳ");
		area5Forum5.put(ABOUT, "ʷ����ɳ");
		area5Forum5.put(FID, "164");
		area5Forums.add(area5Forum5);
		
		FORUMS.add(area5Forums);
		AREAS.add(area5);
		
//		�������� 
		Map<String, String> area6 = new HashMap<String, String>();
		area6.put(NAME, "��������");
		List<Map<String, String>> area6Forums = new ArrayList<Map<String,String>>();
		
		Map<String, String> area6Forum1 = new HashMap<String, String>(3);
		area6Forum1.put(NAME, "������Ѷ");
		area6Forum1.put(ABOUT, "���µ���̳��Ѷ��������̳��̬��ͳͳ�����");
		area6Forum1.put(FID, "21");
		area6Forums.add(area6Forum1);
		
		Map<String, String> area6Forum2 = new HashMap<String, String>(3);
		area6Forum2.put(NAME, "��ת����");
		area6Forum2.put(ABOUT, "I Love This Game");
		area6Forum2.put(FID, "101");
		area6Forums.add(area6Forum2);
		
		Map<String, String> area6Forum3 = new HashMap<String, String>(3);
		area6Forum3.put(NAME, "������");
		area6Forum3.put(ABOUT, "���������������̨��");
		area6Forum3.put(FID, "102");
		area6Forums.add(area6Forum3);
		
		FORUMS.add(area6Forums);
		AREAS.add(area6);
		
//		֪�Ը���
		Map<String, String> area7 = new HashMap<String, String>();
		area7.put(NAME, "֪�Ը���");
		List<Map<String, String>> area7Forums = new ArrayList<Map<String,String>>();
		
		Map<String, String> area7Forum1 = new HashMap<String, String>(3);
		area7Forum1.put(NAME, "����ռ�");
		area7Forum1.put(ABOUT, "���ǵ��������ǳ��������⣬�Ҹ����ӵ��εο�ʼ");
		area7Forum1.put(FID, "6");
		area7Forums.add(area7Forum1);
		
		Map<String, String> area7Forum2 = new HashMap<String, String>(3);
		area7Forum2.put(NAME, "�������");
		area7Forum2.put(ABOUT, "���顢���顢���飬ֻҪ��Ը��ʹ�ҷ����뵽������");
		area7Forum2.put(FID, "12");
		area7Forums.add(area7Forum2);
		
		Map<String, String> area7Forum3 = new HashMap<String, String>(3);
		area7Forum3.put(NAME, "������");
		area7Forum3.put(ABOUT, "������ǣ�һ����ҲҪ���þ��ʣ�����õ��Լ���������");
		area7Forum3.put(FID, "23");
		area7Forums.add(area7Forum3);
		
		FORUMS.add(area7Forums);
		AREAS.add(area7);
		
//		ѧ����ѧ
		Map<String, String> area8 = new HashMap<String, String>();
		area8.put(NAME, "ѧ����ѧ");
		List<Map<String, String>> area8Forums = new ArrayList<Map<String,String>>();
		
		Map<String, String> area8Forum1 = new HashMap<String, String>(3);
		area8Forum1.put(NAME, "�����ݺ�");
		area8Forum1.put(ABOUT, "������ߡ������г�������ʱ���ȵ��¼����㲦���²ƾ�����");
		area8Forum1.put(FID, "115");
		area8Forums.add(area8Forum1);
		
		Map<String, String> area8Forum2 = new HashMap<String, String>(3);
		area8Forum2.put(NAME, "��ҵ����");
		area8Forum2.put(ABOUT, "��е������������������������ӵ��빤ҵ��ص�����");
		area8Forum2.put(FID, "117");
		area8Forums.add(area8Forum2);
		
		Map<String, String> area8Forum3 = new HashMap<String, String>(3);
		area8Forum3.put(NAME, "ũҵ��ѧ");
		area8Forum3.put(ABOUT, "ũҵ��ѧ");
		area8Forum3.put(FID, "116");
		area8Forums.add(area8Forum3);
		
		Map<String, String> area8Forum4 = new HashMap<String, String>(3);
		area8Forum4.put(NAME, "˼��ǰ��");
		area8Forum4.put(ABOUT, "����һ˼�����ϵ۾ͷ��ţ�");
		area8Forum4.put(FID, "3");
		area8Forums.add(area8Forum4);
		
		Map<String, String> area8Forum5 = new HashMap<String, String>(3);
		area8Forum5.put(NAME, "Ӣ���");
		area8Forum5.put(ABOUT, "Where there is a will ,there is a way.Come on ,baby !");
		area8Forum5.put(FID, "62");
		area8Forums.add(area8Forum5);
		
		FORUMS.add(area8Forums);
		AREAS.add(area8);
		
//		���Լ���
		Map<String, String> area9 = new HashMap<String, String>();
		area9.put(NAME, "���Լ���");
		List<Map<String, String>> area9Forums = new ArrayList<Map<String,String>>();
		
		Map<String, String> area9Forum1 = new HashMap<String, String>(3);
		area9Forum1.put(NAME, "��Ӳ��ʩ");
		area9Forum1.put(ABOUT, "�������,Ӳ������,������֢���������Ҵ�~~~~");
		area9Forum1.put(FID, "8");
		area9Forums.add(area9Forum1);
		
		Map<String, String> area9Forum2 = new HashMap<String, String>(3);
		area9Forum2.put(NAME, "����ϵͳ");
		area9Forum2.put(ABOUT, "����ϵͳ");
		area9Forum2.put(FID, "96");
		area9Forums.add(area9Forum2);
		
		Map<String, String> area9Forum3 = new HashMap<String, String>(3);
		area9Forum3.put(NAME, "ͼ��ͼ��");
		area9Forum3.put(ABOUT, "������һ����� �λ�������");
		area9Forum3.put(FID, "97");
		area9Forums.add(area9Forum3);
		
		Map<String, String> area9Forum4 = new HashMap<String, String>(3);
		area9Forum4.put(NAME, "�����ݺ�");
		area9Forum4.put(ABOUT, "�����ݺ�");
		area9Forum4.put(FID, "111");
		area9Forums.add(area9Forum4);
		
		FORUMS.add(area9Forums);
		AREAS.add(area9);
		
//		�ۺ���Ϣ
		Map<String, String> area10 = new HashMap<String, String>();
		area10.put(NAME, "�ۺ���Ϣ");
		List<Map<String, String>> area10Forums = new ArrayList<Map<String,String>>();
		
		Map<String, String> area10Forum1 = new HashMap<String, String>(3);
		area10Forum1.put(NAME, "��ǣ����");
		area10Forum1.put(ABOUT, "��ǣ���� �����й�");
		area10Forum1.put(FID, "24");
		area10Forums.add(area10Forum1);
		
		Map<String, String> area10Forum2 = new HashMap<String, String>(3);
		area10Forum2.put(NAME, "������ѯ");
		area10Forum2.put(ABOUT, "������ѯ");
		area10Forum2.put(FID, "63");
		area10Forums.add(area10Forum2);
		
		Map<String, String> area10Forum3 = new HashMap<String, String>(3);
		area10Forum3.put(NAME, "ǰ������");
		area10Forum3.put(ABOUT, "������Ƹ��Ϣ�����Լ��ɼ�������Ա��Ϣ");
		area10Forum3.put(FID, "72");
		area10Forums.add(area10Forum3);
		
		Map<String, String> area10Forum4 = new HashMap<String, String>(3);
		area10Forum4.put(NAME, "�ȵ�ʱ��");
		area10Forum4.put(ABOUT, "�ȵ�ʱ��");
		area10Forum4.put(FID, "109");
		area10Forums.add(area10Forum4);
		
		Map<String, String> area10Forum5 = new HashMap<String, String>(3);
		area10Forum5.put(NAME, "Ѱ��Ѱ��");
		area10Forum5.put(ABOUT, "Ѱ��Ѱ��");
		area10Forum5.put(FID, "103");
		area10Forums.add(area10Forum5);
		
		Map<String, String> area10Forum6 = new HashMap<String, String>(3);
		area10Forum6.put(NAME, "������֤");
		area10Forum6.put(ABOUT, "������֤");
		area10Forum6.put(FID, "104");
		area10Forums.add(area10Forum6);
		
		FORUMS.add(area10Forums);
		AREAS.add(area10);
		
//		�����г�
		Map<String, String> area11 = new HashMap<String, String>();
		area11.put(NAME, "�����г�");
		List<Map<String, String>> area11Forums = new ArrayList<Map<String,String>>();
		
		Map<String, String> area11Forum1 = new HashMap<String, String>(3);
		area11Forum1.put(NAME, "�¾�����");
		area11Forum1.put(ABOUT, "�¾�����");
		area11Forum1.put(FID, "125");
		area11Forums.add(area11Forum1);
		
		Map<String, String> area11Forum2 = new HashMap<String, String>(3);
		area11Forum2.put(NAME, "���ðٻ�");
		area11Forum2.put(ABOUT, "���ðٻ�");
		area11Forum2.put(FID, "124");
		area11Forums.add(area11Forum2);
		
		Map<String, String> area11Forum3 = new HashMap<String, String>(3);
		area11Forum3.put(NAME, "����ͨѶ");
		area11Forum3.put(ABOUT, "����ͨѶ");
		area11Forum3.put(FID, "126");
		area11Forums.add(area11Forum3);
		
		Map<String, String> area11Forum4 = new HashMap<String, String>(3);
		area11Forum4.put(NAME, "�������");
		area11Forum4.put(ABOUT, "�������");
		area11Forum4.put(FID, "127");
		area11Forums.add(area11Forum4);
		
		FORUMS.add(area11Forums);
		AREAS.add(area11);
		
//		פվд��
		Map<String, String> area12 = new HashMap<String, String>();
		area12.put(NAME, "פվд��");
		List<Map<String, String>> area12Forums = new ArrayList<Map<String,String>>();
		
		Map<String, String> area12Forum1 = new HashMap<String, String>(3);
		area12Forum1.put(NAME, "����");
		area12Forum1.put(ABOUT, "����");
		area12Forum1.put(FID, "53");
		area12Forums.add(area12Forum1);
		
		Map<String, String> area12Forum2 = new HashMap<String, String>(3);
		area12Forum2.put(NAME, "����");
		area12Forum2.put(ABOUT, "����");
		area12Forum2.put(FID, "114");
		area12Forums.add(area12Forum2);
		
		Map<String, String> area12Forum3 = new HashMap<String, String>(3);
		area12Forum3.put(NAME, "echoo");
		area12Forum3.put(ABOUT, "ÿ��дһ�㣬�Ȳ���ϣ����Ҳ������������������Ŭ��д��------����");
		area12Forum3.put(FID, "94");
		area12Forums.add(area12Forum3);
		
		Map<String, String> area12Forum4 = new HashMap<String, String>(3);
		area12Forum4.put(NAME, "������");
		area12Forum4.put(ABOUT, "������");
		area12Forum4.put(FID, "73");
		area12Forums.add(area12Forum4);
		
		Map<String, String> area12Forum5 = new HashMap<String, String>(3);
		area12Forum5.put(NAME, "��������");
		area12Forum5.put(ABOUT, "ǧǧ��");
		area12Forum5.put(FID, "112");
		area12Forums.add(area12Forum5);
		
		Map<String, String> area12Forum6 = new HashMap<String, String>(3);
		area12Forum6.put(NAME, "��һ��");
		area12Forum6.put(ABOUT, "��һ��");
		area12Forum6.put(FID, "50");
		area12Forums.add(area12Forum6);
		
		FORUMS.add(area12Forums);
		AREAS.add(area12);
	}
	
	public static String getForumId(int gid, int cid) {
		return FORUMS.get(gid).get(cid).get(FID);
	}
	
	public static final Map<String, String> getForumData(int gid, int cid) {
		return FORUMS.get(gid).get(cid);
	}
	
}
