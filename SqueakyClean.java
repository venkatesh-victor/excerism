class SqueakyClean {
    static String clean(String identifier) {
        //throw new UnsupportedOperationException("Please implement the (static) SqueakyClean.clean() method");
        StringBuilder out = new StringBuilder();

        if(identifier.length() == 1 || identifier.length() == 3) {
            return identifier;
        }

        for(int i = 0; i < identifier.length(); i++){
            char currentChar = identifier.charAt(i);

            if(Character.isWhitespace(currentChar)) {
                out.append("_");
                continue;
            }


            else if(identifier.charAt(i) == '-') {
                if (i + 1 < identifier.length() && Character.isLetter(identifier.charAt(i + 1))) {
                    out.append(Character.toUpperCase(identifier.charAt(++i)));
                    continue;
                }
            }

            else if(!Character.isLetterOrDigit(currentChar)) {
                continue;
            }

            if(Character.isDigit(currentChar)) {
                if(currentChar == '3'){
                    out.append("e");
                    continue;
                } else if(currentChar == '4') {
                    out.append("a");
                    continue;
                } else if(currentChar == '0') {
                    out.append("o");
                    continue;
                } else if(currentChar == '1') {
                    out.append("l");
                    continue;
                } else if(currentChar == '7') {
                    out.append("t");
                    continue;
                }
            }

            else {
                out.append(currentChar);
            }
        }

        return out.toString();
    }
}
