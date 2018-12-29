package cn.kgeek.echo.protocol.packager.request;

import cn.kgeek.echo.protocol.command.Command;
import cn.kgeek.echo.protocol.packager.Packet;
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
