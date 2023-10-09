public class PostOffice {
    String name;

    PostOffice(String name) {
        this.name = name;
    }

    void send(Post post) {
        String info = String.format("content: %s send by :%s to receiver address: %s",
                post.content, post.senderAddress, post.receiverAddress);

        System.out.println(info);
    }

    void receive(Post post) {
        String info = String.format("content: %s received by :%s from address: %s",
                post.content, post.receiverAddress, post.senderAddress);

        System.out.println(info);

    }
}
