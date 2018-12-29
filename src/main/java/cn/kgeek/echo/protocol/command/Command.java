package cn.kgeek.echo.protocol.command;

import cn.kgeek.echo.protocol.packager.request.LoginRequestPacket;
import cn.kgeek.echo.protocol.packager.Packet;

import java.util.HashMap;
import java.util.Map;

public enum Command  {
    LOGIN_REQUEST((byte) 1, LoginRequestPacket.class);

    private byte value;
    private Class<? extends Packet> packet;
    private static Map<Byte, Command> commandMap = new HashMap<>();

    Command(byte value, Class<? extends Packet>  packet) {
        this.value = value;
        this.packet = packet;

    }

    public byte getValue() {
        return value;
    }

    public Class<? extends Packet>  getPacket() {
        return this.packet;
    }

    static {
        for (Command command :
                Command.values()) {
            commandMap.put(command.getValue(), command);
        }
    }

    public static Command getCommand(Byte commandKey) {
        return commandMap.get(commandKey);
    }
}
