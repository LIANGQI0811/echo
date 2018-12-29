package cn.kgeek.echo.protocol.packager.response;

import cn.kgeek.echo.protocol.command.Command;
import cn.kgeek.echo.protocol.packager.Packet;
import lombok.Data;

@Data
public class LoginResponsePacket extends Packet {
    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {
        return Command.LOGIN_REQUEST.getValue();
    }
}