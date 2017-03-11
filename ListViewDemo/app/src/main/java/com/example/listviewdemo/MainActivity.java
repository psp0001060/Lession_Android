package com.example.listviewdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

    List<HashMap<String, Object>> list = new ArrayList<HashMap<String,Object>>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();

        ListView sinaList = (ListView) findViewById(R.id.sina_list);
        //适配器
        BaseAdapter adapter = new BaseAdapter() {

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                convertView = LayoutInflater.from(MainActivity.this).inflate(R.layout.sina_layout, null);
                ImageView img = (ImageView) convertView.findViewById(R.id.img);
                TextView title = (TextView) convertView.findViewById(R.id.title);
                TextView msg = (TextView) convertView.findViewById(R.id.msg);

                img.setImageResource(Integer.parseInt(list.get(position).get("img")+""));
                title.setText(list.get(position).get("title")+"");
                msg.setText(list.get(position).get("msg")+"");
                return convertView;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public int getCount() {
                // TODO Auto-generated method stub
                return list.size();
            }
        };

        sinaList.setAdapter(adapter);
    }

    public void initData(){
        HashMap<String, Object> map1 = new HashMap<String, Object>();
        map1.put("img", R.drawable.chongzhi);
        map1.put("title", "闻香识女人");
        map1.put("msg", "如果我们能够勇敢地爱，勇敢地去原谅，能慷慨地因为别人的幸福而快乐，能够聪明地知道我们周围有足够的爱，那么我们就完成其他生灵从未知道的完整。——《人生的完整》");
        list.add(map1);

        HashMap<String, Object> map2 = new HashMap<String, Object>();
        map2.put("img", R.drawable.shejiao);
        map2.put("title", "堆糖");
        map2.put("msg", "春水初生,春林初盛,春风十里都不如你。姑娘，每一天都笑对生活，努力向上，你便是那最美的人间四月天。");
        list.add(map2);

        HashMap<String, Object> map3 = new HashMap<String, Object>();
        map3.put("img", R.drawable.shezhi);
        map3.put("title", "电影味道");
        map3.put("msg", "【碧池版迪士尼公主们】周六夜现场的一个搞笑短片：当《美女与野兽》中的美女、白雪公主、《阿拉丁神灯》中的公主、长发公主、灰姑娘聚在一起，展开撕逼大战…真是一场好戏！");
        list.add(map3);

        HashMap<String, Object> map4 = new HashMap<String, Object>();
        map4.put("img", R.drawable.shock);
        map4.put("title", "时尚女王");
        map4.put("msg", "复古的奢华——以色列婚纱品牌Inbal Dror");
        list.add(map4);

        HashMap<String, Object> map5 = new HashMap<String, Object>();
        map5.put("img", R.drawable.snow);
        map5.put("title", "导航1");
        map5.put("msg", "");
        list.add(map5);

        HashMap<String, Object> map6 = new HashMap<String, Object>();
        map6.put("img", R.drawable.sousuo);
        map6.put("title", "爆料帝");
        map6.put("msg", "五一小长假，居家出游，家中进贼怎么办？年轻人出游，空巢老人突发危险怎么办？单独出游，另一半给你戴绿帽子怎么办？所有这些问题，领养一只智能看门狗就能解决：有贼进家即刻报警，空巢老人一键sos，至于另一半，开门开窗全记录铁证如山");
        list.add(map1);

        HashMap<String, Object> map7 = new HashMap<String, Object>();
        map7.put("img", R.drawable.tv);
        map7.put("title", "读书语录");
        map7.put("msg", "宠爱自己，让个性伴随左右，自信地站在自己的位置上，给苍白的四周以绮丽，给庸俗的日子以诗意，给沉闷的空气以清新。每天睁开双眸，用大自然的琴弦，奏响自己喜爱的心曲，告诉自己：我就是一道风景。—— 王牧《女人每天读点幸福禅》");
        list.add(map7);

        HashMap<String, Object> map8 = new HashMap<String, Object>();
        map8.put("img", R.drawable.twitter);
        map8.put("title", "IT技术博客大学习");
        map8.put("msg", "【一名设计师的职业化思考】 开篇先说好，这个题目其实并不适合我这个阅历的人来讲，但是作为工作过7-8年的设计来说，这是不得不思考的问题，今天只是和大家汇报下我自己的想法，仅此而已，言论如有不当，纯属参考。 ――弥难");
        list.add(map8);

        HashMap<String, Object> map9 = new HashMap<String, Object>();
        map9.put("img", R.drawable.units);
        map9.put("title", "幽默僵尸");
        map9.put("msg", "巴哈马建造的世界最刺激滑梯，从玛雅神庙30米高台冲进鲨鱼池，勇敢de挺身站出来？刺激指数爆棚");
        list.add(map9);

        HashMap<String, Object> map10 = new HashMap<String, Object>();
        map10.put("img", R.drawable.xiugai);
        map10.put("title", "美剧小灵通");
        map10.put("msg", "【《实习医生格蕾》男主可能要走了...】外媒报道，ABC电视台医疗剧《实习医生格蕾》的男主角，已经参演该剧长达11年的Patrick Dempsey，有可能将在第11季后离开。他最近接受采访时暗示：“我可能很快就将离开这部剧。离开之后，我可能会继续接拍其他的影视剧，也可能会休息一段时间。”");
        list.add(map10);
    }
}
