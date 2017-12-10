package DesignPattern.Adapter_Pattern;

/**
 * @Description:更高级的媒体播放器 接口
 * @Author: xulihua
 * @date: 2017/12/2 22:37
 */
public interface AdvancedMediaPlayer {
    public void playVlc(String fileName);

    public void playMp4(String fileName);
}
