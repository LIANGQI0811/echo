package cn.kgeek.echo.protocol.packager;

import cn.kgeek.echo.protocol.command.Command;
import lombok.Data;

@Data
public class LoginRequestPacket extends Packet {
    private Integer userId;

    private String username;

    private String password;


    @Override
    public Byte getCommand() {
        return Command.LOGIN_REQUEST.getValue();
    }
}
