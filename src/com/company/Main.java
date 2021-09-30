package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}




public class BattleAppearing {

    static float x = 205F;

    static float y = 572F;

    private static boolean sound = true;

    public BattleAppearing() {
    }

    public static void draw(Graphics g) {
        if (sound) {
            sound = false;
        }
        if (y > 428F)
            g.drawImage(GamePanel.heroImage, (int) x, (int) y, null);
        else if (y <= 428F) {
            GamePanel.AppearingFlag = false;
            x = 205F;
            y = 572F;
            sound = true;
        }
        y -= 2.0F;
    }

}

public static class XmlMsgType {
    public static final String TEXT = "text";
    public static final String IMAGE = "image";
    public static final String VOICE = "voice";
    public static final String SHORTVIDEO = "shortvideo";
    public static final String VIDEO = "video";
    public static final String NEWS = "news";
    public static final String MUSIC = "music";
    public static final String LOCATION = "location";
    public static final String LINK = "link";
    public static final String EVENT = "event";
    public static final String DEVICE_TEXT = "device_text";
    public static final String DEVICE_EVENT = "device_event";
    public static final String DEVICE_STATUS = "device_status";
    public static final String HARDWARE = "hardware";
    public static final String TRANSFER_CUSTOMER_SERVICE = "transfer_customer_service";
    public static final String UPDATE_TASKCARD = "update_taskcard";
}

/**
 * 主动发送消息(即客服消息)的消息类型.
 */
public static class KefuMsgType {
    /**
     * 文本消息.
     */
    public static final String TEXT = "text";
    /**
     * 图片消息.
     */
    public static final String IMAGE = "image";
    /**
     * 语音消息.
     */
    public static final String VOICE = "voice";
    /**
     * 视频消息.
     */
    public static final String VIDEO = "video";
    /**
     * 音乐消息.
     */
    public static final String MUSIC = "music";
    /**
     * 图文消息（点击跳转到外链）.
     */
    public static final String NEWS = "news";
    /**
     * 图文消息（点击跳转到图文消息页面）.
     */
    public static final String MPNEWS = "mpnews";
    /**
     * markdown消息.
     * （目前仅支持markdown语法的子集，微工作台（原企业号）不支持展示markdown消息）
     */
    public static final String MARKDOWN = "markdown";
    /**
     * 发送文件（CP专用）.
     */
    public static final String FILE = "file";
    /**
     * 文本卡片消息（CP专用）.
     */
    public static final String TEXTCARD = "textcard";
    /**
     * 卡券消息.
     */
    public static final String WXCARD = "wxcard";
    /**
     * 转发到客服的消息.
     */
    public static final String TRANSFER_CUSTOMER_SERVICE = "transfer_customer_service";

    /**
     * 小程序卡片(要求小程序与公众号已关联).
     */
    public static final String MINIPROGRAMPAGE = "miniprogrampage";

    /**
     * 任务卡片消息.
     */
    public static final String TASKCARD = "taskcard";

    /**
     * 菜单消息.
     */
    public static final String MSGMENU = "msgmenu";

    /**
     * 小程序通知消息.
     */
    public static final String MINIPROGRAM_NOTICE = "miniprogram_notice";
}

/**
 * 表示是否是保密消息，0表示否，1表示是，默认0.
 */
public static class KefuMsgSafe {
    public static final String NO = "0";
    public static final String YES = "1";
}

/**
 * 群发消息的消息类型.
 */
public static class MassMsgType {
    public static final String MPNEWS = "mpnews";
    public static final String TEXT = "text";
    public static final String VOICE = "voice";
    public static final String IMAGE = "image";
    public static final String MPVIDEO = "mpvideo";
}


/////////draw//////////
window.clear(Color::White);
        window.draw(background);

        for (int i = 0; i<M; i++)
        for (int j = 0; j<N; j++)
        {
        if (field[i][j] == 0) continue;
        s.setTextureRect(IntRect(field[i][j] * 18, 0, 18, 18));
        s.setPosition(j * 18, i * 18);
        s.move(28, 31); //offset
        window.draw(s);
        }

        for (int i = 0; i<4; i++)
        {
        s.setTextureRect(IntRect(colorNum * 18, 0, 18, 18));
        s.setPosition(a[i].x * 18, a[i].y * 18);
        s.move(28, 31); //offset
        window.draw(s);
        }

// next box
        nextBox.setTextureRect(IntRect(0, 0, 72, 108));
        nextBox.setPosition(240, 20);
        window.draw(nextBox);

// draw next item
        for (int i = 0; i<4; i++)
        {
        s.setTextureRect(IntRect(colorNum_next * 18, 0, 18, 18));
        s.setPosition(240+18+a[i].x_next * 18, 20+18+a[i].y_next* 18);
        //s.move(28, 31); //offset
        window.draw(s);
        }

        window.draw(frame);
        window.display();