public record Member(String name, int memberID) {
    @Override
    public String toString(){
        return String.format("Name: %s \t Membership Number: %d",name ,memberID);
    }
}
