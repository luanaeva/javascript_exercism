class LogLineParser
  def initialize(line)
    @line = line
  end

  def message
    bad_words = ["[ERROR]:", "[WARNING]:", "[INFO]:"]
    regex = Regexp.union(bad_words)
    return @line.gsub(regex, "").strip 
  end

  def log_level
    if @line.include?("[ERROR]:")
        return "error"
      else if @line.include?("[INFO]:")
        return "info"
      else
        return "warning"
      end
    end  
  end

  def reformat
    message_line = self.message
    level_line = self.log_level
    return "#{message_line} (#{level_line})"
  end
end
