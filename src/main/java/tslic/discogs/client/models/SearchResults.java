package tslic.discogs.client.models;

import java.util.List;
import lombok.Data;

@Data
public class SearchResults {

  private List<SearchResult> results;

  private Pagination pagination;
}
